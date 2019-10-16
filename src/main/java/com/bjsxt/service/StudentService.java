package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Student;

public interface StudentService {
	  List<Student> selectStudentAll(); //查询所有学生对象
	  public Integer   delStudentById(int stuNo);	//删除学生的方法
	
	  public int addStudent(Student stu);		//添加用户的方法
	  public Integer updateStudent(Student stu);//修改学生的方法


	  Student selectStudentById(int stuNo);//通过学生编号查询


}
