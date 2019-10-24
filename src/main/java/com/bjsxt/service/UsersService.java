package com.bjsxt.service;

import org.springframework.stereotype.Service;

import com.bjsxt.pojo.userInfo;
public interface UsersService {
	  userInfo loginUsers(String userName , String userPwd );

}
