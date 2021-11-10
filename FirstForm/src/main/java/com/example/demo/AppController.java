package com.example.demo;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@GetMapping("/")
	
	public String welcome() {
		return "welcome";
		
		
	}
	
	@PostMapping("/details")
	public String ViewDetails(@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail,ModelMap mm) {
		mm.put("cname",cname);
		mm.put("cemail",cemail);
		return "ViewDetail";
	}
	

}
