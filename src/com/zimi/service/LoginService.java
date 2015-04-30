package com.zimi.service;

import java.util.HashMap;

import com.zimi.dto.User;

public class LoginService {
	HashMap<String, String>users = new HashMap();
	public LoginService(){
		users.put("johndoe", "John Doe");
		users.put("janedoe", "John Doe");
		users.put("jgru",  "Java Guru");
	}
	public boolean authenticate(String userId, String userPass){
			//JDBC IMPEMENTATION
		if(userPass!=null && userPass!="")
			return true;
		else
			return false;
	}
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
	
}
