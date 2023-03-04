package toyproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

	@GetMapping("/")
	public String main(Model model) {
		return "user/main";
	}
	@GetMapping("/2")
	public String main2(Model model) {
		return "user/main2";
	}
}
