package com.jooq.crud.service;

import java.util.List;

import com.jooq.crud.model.Tables;
import com.jooq.crud.model.tables.pojos.Users;

public interface UserService {
	
	public List<Users> getUsers();
	
	public void updateUsers(Users user);
	
	public void deleteUsers(Users user);
	
	public void addUsers(Users user);
	
	public String checking();
	
	
}
