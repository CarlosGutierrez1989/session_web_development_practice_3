package com.cds.CDSSpotify.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cds.CDSSpotify.model.User;
import com.cds.CDSSpotify.service.UserService;
import com.cds.CDSSpotify.utils.Utils;

@RequestMapping("/users")
@Controller
public class UsersController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

	@GetMapping("")
	public String songs(HttpSession session, Model model) {
		if(!Utils.checkUserIsLog(session)) {
			return "redirect:/login";
		}
		
		User userLog = (User) session.getAttribute("userLog");
		List<User> users = userService.findAll();

		model.addAttribute("userLog", userLog);
		
		for (User user : users) {
			if(user.getPhoto() == null) {
				user.setPhoto(Utils.generatePhotos());
			}
			if(user.getMusicLike() == null) {
				user.setMusicLike(Utils.generateMusicLike());
			}
		}
		
		model.addAttribute("users", users);

		
		
		return "users";
	}

}
