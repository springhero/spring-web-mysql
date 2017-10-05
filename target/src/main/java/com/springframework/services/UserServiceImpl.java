package com.springframework.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.domain.Role;
import com.springframework.domain.User;
import com.springframework.repositories.RoleRepository;
import com.springframework.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	public void setProductRepository(UserRepository productRepository) {
		this.userRepository = productRepository;
	}

	@Override
	public Iterable<User> listAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserbyId(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User saveUser(User user) {
		String[] split = user.getRoleString().split(",");
		Set<Role> roles = new HashSet<>();
		User newUser = new User();
		newUser.setId(user.getId());
		newUser.setUserName(user.getUserName());
		try {
			for (int i = 0; i < split.length; i++) {
				Role role = roleRepository.findByRole(split[i]);
				if(role == null){
					Role role2 = new Role();
					role2.setRole(split[i]);
					role2 = roleRepository.save(role2);
					roles.add(role2);
					continue;
				}
				roles.add(role);
			}
			newUser.setRoles(roles);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		user = userRepository.save(newUser);
		return user;
	}
}
