package com.daniel.api.post.diopostapi.services.imp;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.daniel.api.post.diopostapi.model.User;
import com.daniel.api.post.diopostapi.repositories.UserRepository;
import com.daniel.api.post.diopostapi.services.UserService;

@Service
public class UserServiceImp implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("This User ID already exists");
		}
		return userRepository.save(userToCreate);
	}

}
