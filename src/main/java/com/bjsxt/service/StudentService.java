package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.userInfo;

public interface StudentService {
	  List<Student> selectStudentAll(); //查询所有学生对象
	  public Integer   delStudentById(int stuNo);	//删除学生的方法
	
	  public int addStudent(Student stu);		//添加用户的方法
	  public Integer updateStudent(Student stu);//修改学生的方法


	  Student selectStudentById(int stuNo);//通过学生编号查询
	  
	  userInfo loginUser(String userName , String userPwd);
	  
	  List<Student> getStudentByPage(Page page);//分页查询的方法
	  
	  int getAllStudentCount();	//查询所有的学生总数量
}
