package com.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.dto.UserRegistrationDto;
import com.spring.model.User;
;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

