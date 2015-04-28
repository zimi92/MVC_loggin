package com.zimi.service;

public class LoginService {
	public boolean authenticate(String userId, String userPass){
			//JDBC IMPEMENTATION
		if(userPass!=null)
			return true;
		else
			return false;
	}
}
