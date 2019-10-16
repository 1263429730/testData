package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
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
	
	
}
