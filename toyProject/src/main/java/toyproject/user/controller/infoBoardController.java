package toyproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class infoBoardController {
	
	@GetMapping("/infoBoard")
	public String main(Model model) {
		model.addAttribute("title", "정보 게시판");
		return "user/info/infoBoard";
	}
}
