package com.bjsxt.springboothello;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.EurekaApplication;
import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.StudentService;
import com.bjsxt.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EurekaApplication.class)
public class SpringbootHelloApplicationTests {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private StudentService studentService; 
	
	@Autowired 
	private UsersService userService;
	@Test
	public void loginTest() {
	
	System.out.println(userService.loginUsers("root", "123456"));
	}

	@Test
	public void findAllStudent() {
	List<Student> user=studentMapper.selectStudentAll();
	System.out.println(user);
	}
	
	@Test
	public void findStuById() {
	Student user=studentMapper.selectStudentById(360);
	System.out.println(user);
	}
	
	/**
	 * 测试分页的方法
	 */
	@Test
	public void findStudnetByPage() {
		Page page = null;
		List<Student> stuList;
		int totalCount=studentMapper.getAllStudentCount(); //获取所有学生的数量
		System.out.println("总数量是++++++++++"+totalCount);
		page = new Page(totalCount, 1);
		stuList=studentMapper.getStudentByPage(page);
		for (Student student : stuList) {
			System.out.println(student);
		}
	}
}
