package com.capgemini.bechdalo.group7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	@RequestMapping("/register")
	public ModelAndView openregistration() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	
	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public ModelAndView Register(Model model, @ModelAttribute("user") User user, @ModelAttribute("name")String fullname, @ModelAttribute("fullName")String uname, @ModelAttribute("password")String password, @ModelAttribute("phone")String phone, @ModelAttribute("email")String email, @ModelAttribute("address")String address, @ModelAttribute("gender")String gender) {
		if((service.findByEmail(email) == null) && (service.findByPhone(phone) == null) && (service.Username(uname) == null)) {
			com.capgemini.bechdalo.group7.User user1= service.create(fullname, uname, password, phone, email, address, gender);
			ModelAndView mav = new ModelAndView(); 
			mav.addObject("users", user1);
			mav.setViewName("login");
			return mav;
		}
		else {
			System.out.println("vvv");
			ModelAndView mav = new ModelAndView(); 
			model.addAttribute("msg", "Email id or phone number already exist");
			mav.setViewName("register");
			return mav;
		}
	}
		@RequestMapping(value="/submit_login", method = RequestMethod.POST)
		public ModelAndView Login(Model model, @ModelAttribute("user") User user,  @ModelAttribute("fullName")String uname, @ModelAttribute("password")String password) {
			if((service.Username(uname) != null) && (service.findByPassword(password) != null) ) {
				
				ModelAndView mav = new ModelAndView(); 
				mav.addObject("users", user);
				mav.setViewName("homepage");
				return mav;
			}
			else {
				System.out.println("vvv");
				ModelAndView mav = new ModelAndView(); 
				model.addAttribute("msg", "Username or password is incorrect");
				mav.setViewName("login");
				return mav;
			}
	}
	
	
	
}
