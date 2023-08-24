package com.daniel.api.post.diopostapi.services;

import com.daniel.api.post.diopostapi.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
}
