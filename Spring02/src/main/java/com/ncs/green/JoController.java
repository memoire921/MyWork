package com.ncs.green;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.JoDTO;
import lombok.AllArgsConstructor;
import service.JoService;


//@Log4j
@AllArgsConstructor // @Autowired 를 사용하지 않아도됨 // 모든값을 초기화 하는 생성자
@RequestMapping(value = "/jo") // "/board" 로 시작하는 모든 요청을 처리
@Controller
public class JoController {

	JoService service;
	
	// ** joList 
	@GetMapping(value = "/joList")
	public void joList(Model model) {
		model.addAttribute("banana", service.selectList());
	}
	
	// ** joDetail
	@GetMapping(value = "/jodetail")
	public String jodetail(HttpServletRequest request, Model model, JoDTO dto) {
		
		model.addAttribute("apple", service.selectOne(dto));
		
		// => 글 수정화면 요청인 경우 구분
		if ( "U".equals(request.getParameter("jCode")) )
			return "jo/joUpdate";
	   else return "jo/joDetail";
	} //joDetail

	// ** 새조 등록: insert
	@GetMapping(value = "/joInsert")
	public void joInsert() {
		// viewName 생략 -> 요청명이 viewName 이 됨
	}
	
	// => Insert Service 처리: POST
	@PostMapping(value = "/jinsert")
	public String jinsert(JoDTO dto, Model model, RedirectAttributes rttr) {
	    // 1. 요청분석 & Service
        // => 성공: joList
        // => 실패: 재입력 유도 (입력폼 으로, jo/joInsert.jsp)
		String uri = "redirect:joList"; // 성공
		
		// 2. Service 처리
		if ( service.insert(dto) > 0 ) {
			rttr.addFlashAttribute("message", "~~ 새조 등록 성공!! ~~");
		} else {
			model.addAttribute("message", "~~ 새조 등록 실패!! 다시 하세요 ~~");
			uri = "jo/joInsert";
		}
		
		// 3. View
		return uri;
	} //jInsert
	
	// ** jo Update
	// => 성공: joDetail
	// => 실패: joUpdate
	@PostMapping(value = "/jupdate")
	public String jUpdate(JoDTO dto, Model model) {
		
		// => 처리결과에 따른 화면 출력을 위해서 dto 의 값을 Attribute 에 보관
		model.addAttribute("apple", dto);
		String uri = "jo/joDetail";
		
		// => Service 처리
		if ( service.update(dto) > 0 ) {
			model.addAttribute("message", "~~ 조 수정 성공 ~~");
		} else {
			model.addAttribute("message", "~~ 조 수정 실패 !! 다시 하세요 ~~");
			uri = "jo/joUpdate";
		}
		return uri;
	} //bUpdate
	
	// ** jo Delete
	@GetMapping(value = "/jdelete")
	public String jdelete(JoDTO dto, Model model, RedirectAttributes rttr) {
		
		String uri = "redirect:joList";
		if ( service.delete(dto) > 0 ) {
			rttr.addFlashAttribute("message", "~~ 조 삭제 성공!! ~~");
		} else {
			rttr.addFlashAttribute("message", "~~ 조 삭제 실패 ~~");
		}
		return uri;
	} //jdelete
	
} //class
