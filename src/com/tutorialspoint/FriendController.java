package com.tutorialspoint;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller 
public class FriendController {
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView friend() {
		return new ModelAndView("Signup", "command", new Friend());
		
	}
	
	@RequestMapping(value = "/signup-com", method = RequestMethod.POST)
	public String addFriend(@ModelAttribute("SpringWeb")Friend friend,
			ModelMap model){
		model.addAttribute("name", friend.getName() );
		model.addAttribute("age", friend.getAge() );
		model.addAttribute("id", friend.getId() );
		model.addAttribute("password", friend.getId() );
		
		return "result";
	}
}