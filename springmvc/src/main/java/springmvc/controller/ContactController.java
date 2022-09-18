package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	/*
	 * @RequestMapping(path="/processform" ,method= RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("email") String userEmail ,
	 * 
	 * @RequestParam("userName") String username,
	 * 
	 * @RequestParam("pass") String password,Model model) {
	 * 
	 * model.addAttribute("name",username); model.addAttribute("email",userEmail);
	 * model.addAttribute("pass",password); System.out.println(userEmail+
	 * " "+username+""+password); return "success"; }
	 */
	
	//another way
	/*
	 * @RequestMapping(path="/processform" ,method= RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("email") String userEmail ,
	 * 
	 * @RequestParam("userName") String username,
	 * 
	 * @RequestParam("pass") String password,Model model) {
	 * 
	 * User user=new User(); user.setUserName(username); user.setPass(password);
	 * user.setEmail(userEmail);
	 * 
	 * System.out.println(user); model.addAttribute("user", user); return
	 * "successful"; }
	 */
	
	//Model Attribute
	@RequestMapping(path="/processform" ,method= RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
		System.out.println(user);
			return "successful";
	}
	
	@ModelAttribute
	public void commonDataForAllPage(Model m) {
		m.addAttribute("Header","Learning Spring Course");
		m.addAttribute("Desc","in 15 days");
	}
	
}
