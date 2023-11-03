package buildTest;

import com.ncs.green.domain.UserDTO;
import com.ncs.green.service.DTOService;

public class BuildTest {

	public static void main(String[] args) {
		// 1) UserDTO 생성
		UserDTO dto = new UserDTO();
		dto.setId("banana");
		dto.setName("아담스캇");
		dto.setLoginTime("2023/11/03/ pm 5:34");
		
		// 2) 직접 출력
		System.out.println("** 직접 출력 => "+dto);
		
		// 3) DTOService 로 출력
		DTOService service = new DTOService();
		service.setUserDTO(dto);
		System.out.println("** jar 사용 Test **");
		System.out.println("** DTOService => "+service.getUserDTO());
	} //main

} //class
