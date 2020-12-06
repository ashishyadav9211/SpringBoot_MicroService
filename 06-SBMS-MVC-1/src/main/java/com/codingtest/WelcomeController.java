package com.codingtest;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView displayWelcome() {
		System.out.println("Welcome to Spring MVC!!");
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Ashok IT...!!");
		mav.setViewName("welcome");
		return mav;
	}

	@GetMapping("/greet")
	public ModelAndView displayGreet() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning..!!");
		mav.setViewName("welcome");
		return mav;
	}

	@GetMapping("/date")
	public String displayDate(Model model) {
		model.addAttribute("msg", "Today's Date Is :: " + new Date());
		return "welcome";
	}

	@GetMapping("/qparam_test")
	public ModelAndView next(User user) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("welcome");
		System.out.println(user);
		return mv;
	}
}