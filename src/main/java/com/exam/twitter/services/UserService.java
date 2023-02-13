package com.exam.twitter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.exam.twitter.dtos.UserDTO;
import com.exam.twitter.dtos.UserFormDTO;
import com.exam.twitter.models.LocalUser;
import com.exam.twitter.repositories.UserRepository;


@Service
public class UserService {

	private UserRepository userRepository;
	
	private PasswordEncoder passwordEncoder;
	
	
	
	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		
	}
	
	public List<UserDTO> getUsers() {
		
		List<LocalUser> users = userRepository.getUsers();
		List<UserDTO> userDtos = new ArrayList<>();
		
		users.forEach((user) -> {
			userDtos.add(new UserDTO(user.getId(), user.getUsername(), user.getRole()));
		});

		return userDtos;
	}
	
	public void saveUser(UserFormDTO inputUser) {
		LocalUser user = new LocalUser();
		user.setUsername(inputUser.username());
		user.setPassword(passwordEncoder.encode(inputUser.password()));
		user.setRole("USER");		
		userRepository.save(user);	
	}	
}
		
