package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {
	@RequestMapping("/img")
	public String img() {
		return "model/img";
	}
	
}
