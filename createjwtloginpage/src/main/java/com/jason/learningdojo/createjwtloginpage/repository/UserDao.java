package com.jason.learningdojo.createjwtloginpage.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private List<User> fakeUserTable = new ArrayList<User>();
	
	public UserDao() {
		this.fakeUserTable.add(new User("barbie", "19590309"));
		this.fakeUserTable.add(new User("ken", "19619311"));
	}

	public User getUserByUsernamePassword(String username, String password) {
		for (User user : this.fakeUserTable) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		
		return null;
	}
}
