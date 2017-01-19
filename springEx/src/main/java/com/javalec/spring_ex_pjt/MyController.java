package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/board/view")
	public String view() {
		return "board/view";
	}
	
	@RequestMapping("/board/content")
	public String board(Model model) {
		model.addAttribute("id","Content_id");
		return "board/content";
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "Reply_id");
		mv.setViewName("board/reply");
		
		return mv;
	}
}
