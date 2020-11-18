package com.cg.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/MVCWithValidation")
public class SecondController {
 
	@RequestMapping(value="/showView", method = RequestMethod.GET)
	public String justMethod(Model model) throws Exception {
		model.addAttribute("user", new User());
		return "second";
	}
	
	@RequestMapping(value="/firstMethod", method = RequestMethod.POST)
	public String anotherMethod(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) throws Exception {
		if(result.hasErrors()) {
			return "second";
		}
		model.addAttribute("msg", "Registered Successfully");
		return "next";
	}
	
}
