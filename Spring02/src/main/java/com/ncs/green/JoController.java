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
import service.MemberService;


//@Log4j
@AllArgsConstructor // @Autowired 를 사용하지 않아도됨 // 모든값을 초기화 하는 생성자
@RequestMapping(value = "/jo") // "/board" 로 시작하는 모든 요청을 처리
@Controller
public class JoController {

	//@Autowired
	JoService service;
	//@Autowired
	MemberService mservice;
	
	// ** joList 
	@GetMapping(value = "/joList")
	public void joList(Model model) {
		model.addAttribute("banana", service.selectList());
	} //joList
	
	// ** JoDetail
	// => 아랫쪽에 조원목록 출력 (추가기능) -> joDetail.jap 에 Member_List 출력 코드 추가  
	// => jo Table에서 selectOne  ->  apple 
	// => member Table에서 조건검색 jno=#{jno}  ->  banana
	@GetMapping(value = "/jdetail")
	public String jdetail(HttpServletRequest request, Model model, JoDTO dto) {
		
			String uri = "jo/joDetail";
			model.addAttribute("apple", service.selectOne(dto));
			// => 수정요청 시엔 수정폼으로 
			if ( "U".equals(request.getParameter("jCode")) )
				uri = "jo/joUpdate";
		
			// ** 조원목록 출력하기 추가
			// => MemberService 실행
			//	-> joList 메서드 추가 : service, DAO 
			//	-> 실행결과는 banana 로 
			model.addAttribute("banana", mservice.joList(dto.getJno()));

			return uri;
	} //jdetail

	// ** 새조 등록: Jo_Insert
	@GetMapping(value = "/joInsert")
	public void joInsert() {
		// viewName 생략 -> 요청명이 viewName 이 됨
	} //joInsert
	
	// => jo_insert Service 처리: POST
	@PostMapping(value = "/jinsert")
	public String jinsert(JoDTO dto, Model model, RedirectAttributes rttr) {
	    // 1. 요청분석 & Service
        // => 성공: joList 로 redirect
        // => 실패: 재입력 유도 -> insert 폼 요청 (입력폼 으로, jo/joInsert.jsp)
		String uri = "redirect:joList"; // 성공
		
		// 2. Service 처리
		if ( service.insert(dto) > 0 ) {
			rttr.addFlashAttribute("message", "~~ Jo_Insert 성공!! ~~");
		} else {
			model.addAttribute("message", "~~ Jo_Insert 실패!! 다시 하세요 ~~");
			uri = "jo/joInsert";
		}
		
		// 3. View
		return uri;
	} //jinsert
	
	// ** jo Update
	// => 성공: joDetail
	// => 실패: joUpdate
	@PostMapping(value = "/jupdate")
	public String jupdate(HttpServletRequest request, JoDTO dto, Model model, RedirectAttributes rttr) {
		
		// ** Update Service 처리
		// => 성공: joList 로 redirect
		// => 실패: 재수정 유도 -> joUpdate 폼으로
		// => 그러므로 출력가능하도록 dto 를 setAttribute
		model.addAttribute("apple", dto);
		String uri = "redirect:joList";
		
		// => Service 처리
		if ( service.update(dto) > 0 ) {
			// 수정성공 -> JList 로 redirect
			rttr.addFlashAttribute("message", "~~ Jo 정보 수정 성공 ~~");
		} else {
			// 수정실패
			model.addAttribute("message", "~~ Jo 정보 수정 실패 !! 다시 하세요 ~~");
			uri = "jo/joUpdate";
		}
		
		// View 처리
		return uri;
	} //jupdate
	
	// ** jo Delete
	@GetMapping(value = "/jdelete")
	public String jdelete(JoDTO dto, RedirectAttributes rttr) {
		
		// ** Delete Service 처리
		// => 성공, 실패 : joList 로 redirect
		String uri = "redirect:joList";
		if ( service.delete(dto) > 0 ) {
			rttr.addFlashAttribute("message", "~~ Jo 삭제 성공!! ~~");
		} else {
			rttr.addFlashAttribute("message", "~~ Jo 삭제 실패!! ~~");
		}
		// View 처리
		return uri;
	} //jdelete
	
} //class
