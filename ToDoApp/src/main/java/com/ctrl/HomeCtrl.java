package com.ctrl;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="home";
		m.addAttribute("page", str);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addToDo(Model m) 
	{
		ToDo t = new ToDo();
		m.addAttribute("page", "add");
		m.addAttribute("todo",t);
		return "home";
	}
	

}
