package com.ke.Login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.ke.Login.models.MyUser;
import com.ke.Login.services.UserService;

@Controller
public class UserController {

	@Autowired private UserService userService;
	
	@GetMapping("/users")
	public String getUsers() {
		return "User";
	}
	
	
	//Modified method to Add a new user User
	@PostMapping(value="users/addNew")
	public RedirectView addNew(MyUser user, RedirectAttributes redir) {
		
		userService.save(user);	
		
		RedirectView  redirectView= new RedirectView("/login",true);
		
	    redir.addFlashAttribute("message",	"Registration Successful! You can now login");
	        
	    return redirectView;				
	}
	
}
