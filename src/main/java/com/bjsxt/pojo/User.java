package com.bjsxt.pojo;

public class User {
	private  int userid;
	private String username;
	private int age;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int userid, String username, int age) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
	}
	public User() {}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", age=" + age + "]";
	}
	
}
