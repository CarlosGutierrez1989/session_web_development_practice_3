package com.cds.CDSSpotify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cds.CDSSpotify.model.User;
import com.cds.CDSSpotify.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;


	public User findByNameAndPassword(User user) {
		
		User u = userRepository.findByName(user.getName());
		
		if(u != null && u.getPassword().equals(user.getPassword()) ) {
				return u;
		}
		
		return null;
	}

	


	public List<User> findAll() {
		return userRepository.findAll();
	}


	public User save(User user) {
		return userRepository.save(user);
	}




	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}




	public User findByName(String name) {
		return userRepository.findByName(name);
	}
	

}
