package com.tutorialspoint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Friend {
	 private Integer age;
	 private String name;
	 private Integer id;
	 private String password;
	 private int[] friends_array;
	public Integer getAge() {
		return age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int[] getFriends_array() {
		return friends_array;
	}
	public void setFriends_array(int[] friends_array) {
		this.friends_array = friends_array;
	}
		 
}