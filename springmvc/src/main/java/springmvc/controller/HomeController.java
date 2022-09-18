package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Muskan");
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	
		model.addAttribute("num", numbers);
		return "index";
	}
	
	@RequestMapping("/about")
	public String About() {
		System.out.println("In About Page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView Help() {
		ModelAndView model=new ModelAndView();
		//setting the data
		model.addObject("name", "Muskan");
		model.addObject("rollnumber", 12345);
		LocalDateTime now=LocalDateTime.now();
		model.addObject("time",now);
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(11);
		marks.add(27);
		marks.add(39);
		
		model.addObject("marks",marks);
		
		//settng the view name
		model.setViewName("help");
		return model;
	}

}
