package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.userInfo;
import com.bjsxt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	
	@Override
	public List<Student> selectStudentAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentAll();
	}

	@Override
	public Student selectStudentById(int stuNo) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentById(stuNo);
	}

	@Override
	public Integer  delStudentById(int stuNo) {
		return studentMapper.delStudentById(stuNo);
	}

	@Override
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.addStudent(stu);
	}

	@Override
	public Integer updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudent(stu);
	}

	@Override
	public userInfo loginUser(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return studentMapper.loginUsers(userName, userPwd);
	}


	@Override
	public List<Student> getStudentByPage(Page page) {
		// TODO Auto-generated method stub
		return studentMapper.getStudentByPage(page);
	}

	@Override
	public int getAllStudentCount() {
		// TODO Auto-generated method stub
		return studentMapper.getAllStudentCount();
	}

	
}
