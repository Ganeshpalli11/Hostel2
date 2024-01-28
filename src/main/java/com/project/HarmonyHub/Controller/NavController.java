package com.project.HarmonyHub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/login1")
String loginPage() {
	return "login1";
}
	@GetMapping("/reg")
String RegPage() {
	return "Register";
}
}
