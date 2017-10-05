package com.springframework.services;

import com.springframework.domain.User;

public interface UserService {
	
	Iterable<User> listAllUsers();

	User saveUser(User user);

	User getUserbyId(Long id);
}
