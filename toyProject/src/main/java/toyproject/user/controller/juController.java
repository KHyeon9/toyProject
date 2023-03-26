package toyproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/ju")
public class juController {

	@GetMapping("/")
	public String main(Model model) {
		return "ju/julogin";
	}
	
}
