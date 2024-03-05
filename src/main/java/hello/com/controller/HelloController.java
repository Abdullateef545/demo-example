package hello.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/add")
	public String addStudent() {
		return "addStudent";
	}
	
}
