package com.jooq.crud.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import com.jooq.crud.model.Tables;
//import com.jooq.crud.model.Checkjooq;

import com.jooq.crud.model.tables.pojos.Users;
import com.jooq.crud.model.tables.records.UsersRecord;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	DSLContext context;
//	UserServiceImpl()
//	{
//		String user="root";
//		String pass="";
//		String url="jdbc:mysql://localhost:3306/first_jooq";
//		Connection conn;
//		try {
//			conn = DriverManager.getConnection(url, user, pass);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			conn=null;
//			e.printStackTrace();
//		}
//		context=DSL.using(conn, SQLDialect.MYSQL);
//
//	}
	
		
	public void addUsers(Users user)
	{
		context
			.insertInto(Tables.USERS, Tables.USERS.ID, Tables.USERS.NAME, Tables.USERS.AGE)
			.values(user.getId(),user.getName(),user.getAge())
			.execute();
//		Users u=new Users();
//		
//		UsersRecord u=context.newRecord(USERS.USERS);
//		u.setId(user.getId());
//		u.setName(user.getName());
//		u.setAge(user.getAge());
////		u.store();
		
		
//		 context.insertInto(Tables.USERS)
//	       .set("id", 6)
//	       .set("name", "sai")
//	       .set("age", 34)
//	       .newRecord()
//	       .execute();
		 
//		context.insertInto(Tables.USERS, 6, "sai",34 );
	}
	public List<Users> getUsers()
	{
//		UsersRecord u=context.newRecord(USERS);
		return context
				.selectFrom(Tables.USERS)
				.fetchInto(Users.class);
		
	}
	
	public void updateUsers(Users user)
	{
		
		Users u=new Users();
		context.update(Tables.USERS)
			.set(Tables.USERS.NAME,user.getName())
			.set(Tables.USERS.AGE,user.getAge())
			.where(Tables.USERS.ID.eq(user.getId()))
			.execute();
	}
	
	public void deleteUsers(Users user)
	{
		Users u=new Users();
		context.delete(Tables.USERS)
			.where(Tables.USERS.ID.eq(user.getId()))
			.execute();
	}
	
	public String checking()
	 {
		 return("HI");
	 }
}
