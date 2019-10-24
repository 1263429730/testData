package com.bjsxt.pojo;

public class Student {
	private Integer stuNo;//学号
	
	private String stuName;//姓名
	
	private String stuSex;//性别
	
	private String major;//专业
	
	private int age;//年龄
	
	private float score;//成绩
	
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public String lis(){
		return "认真听";
	}
	
	public String play(){
		return "玩耍";
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuSex=" + stuSex + ", major=" + major + ", age="
				+ age + ", score=" + score + "]";
	}

	
	

}
