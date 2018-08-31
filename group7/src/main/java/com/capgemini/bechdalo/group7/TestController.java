package com.capgemini.bechdalo.group7;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bechdalo.dao.registerDAO;
import com.capgemini.bechdalo.pojo.userDetails;

@RestController
public class TestController {
	//registerDAO obj;
       @GetMapping("/homepage")
       public ModelAndView homepage() {
              ModelAndView mav= new ModelAndView("homepage");
              return mav;
       }
       
       @GetMapping("/login")
       public ModelAndView login(@ModelAttribute("name")String fullName, @ModelAttribute("userName")String userName,
    		   @ModelAttribute("email")String email,@ModelAttribute("password")String password,@ModelAttribute("address")String address,
    		   @ModelAttribute("phone")String phoneNumber,@ModelAttribute("gender")String gender,
    		   Model model) {
              ModelAndView mav= new ModelAndView("login");
              
              /*String fullName=request.getParameter("name");
              String userName=request.getParameter("userName");
              String email=request.getParameter("email");
              String password=request.getParameter("password");
              String address=request.getParameter("address");
             String phoneNumber=request.getParameter("phone");
             String gender=request.getParameter("gender");*/
             userDetails obj= new userDetails(fullName, userName,email,password,address,phoneNumber,gender);
             registerDAO.insert(obj);
             /*obj.toString();
              System.out.println(obj);*/
              return mav;
       }
       @GetMapping("/register")
       public ModelAndView register() {
              ModelAndView mav= new ModelAndView("register");
              return mav;
       }
       @GetMapping("/demo")
       public ModelAndView demo(@ModelAttribute("username")String userName,@ModelAttribute("password")String password) {
              //ModelAndView mav; ;
             int flag=registerDAO.validate(userName,password);
             System.out.println(flag);
             if (flag==1)
              return new ModelAndView("demo");
             else
             return new ModelAndView("error");
       }
}
