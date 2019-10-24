package com.bjsxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.userInfo;
import com.bjsxt.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public userInfo loginUsers(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return studentMapper.loginUsers(userName, userPwd);
	}

}
