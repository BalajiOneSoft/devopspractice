package com.myapp.devopsPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Devops1 {
	@GetMapping(value="/practice")
	public String getMsg() {
		
		return "this is devops practice";
	}

}
