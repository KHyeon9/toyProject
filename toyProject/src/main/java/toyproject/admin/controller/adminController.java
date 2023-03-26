package toyproject.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminController {

	@GetMapping("/admin")
	public String admin(Model model) {
		return "admin/main";
	}
}
