package com.cds.CDSSpotify.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cds.CDSSpotify.model.User;
import com.cds.CDSSpotify.service.UserService;

@RequestMapping("/login")
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("")
	public String loginGet(HttpSession session, Model model) {
		model.addAttribute("user", new User());
		User user = (User) session.getAttribute("userLog");

		if (user == null) {
			return "login";
		}

		return "redirect:/songs";

	}

	@PostMapping("/log")
	public String loginPost(@ModelAttribute User user, HttpSession session, Model model) {

		User u = userService.findByNameAndPassword(user);

		if (u == null) {
			session.setAttribute("errorMessageBool", true);
			session.setAttribute("errorMessage", "Credentials error");
			return "redirect:/login";
		}

		session.removeAttribute("errorMessageBool");
		session.removeAttribute("errorMessage");
		session.setAttribute("userLog", u);

		return "redirect:/songs";

	}
	
	@PostMapping("/createUser")
	public String loginCreateUser(@ModelAttribute User user, HttpSession session, Model model) {

		User u = userService.findByName(user.getName());
		if(u != null) {
			session.setAttribute("errorMessage", "Name " + user.getName() +  " already registered.");
			session.setAttribute("errorMessageBool", true);
			return "redirect:/login";
		}
		
		session.removeAttribute("errorMessageBool");
		session.removeAttribute("errorMessage");
		u  = userService.save(user);
		session.setAttribute("userLog", u);

		return "redirect:/songs";

	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userLog");
		return "redirect:/login";
	}


}
