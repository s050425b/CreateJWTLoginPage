package com.jason.learningdojo.createjwtloginpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.learningdojo.createjwtloginpage.repository.UserDao;

@Service
public class JwtLoginService {

	@Autowired
	private UserDao userDao;
}
