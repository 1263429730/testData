package com.bjsxt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjsxt.pojo.Student;
import com.bjsxt.service.StudentService;

import net.sf.json.JSONArray;

@RestController
public class UserController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("findAllStu")
	public List<Student> findAllStudent(HttpServletResponse response) throws IOException{
	    response.setCharacterEncoding("UTF-8");
		//请求头
		response.addHeader( "Access-Control-Allow-Origin", "*" );
		List<Student> stuList=studentService.selectStudentAll();
		return stuList;
	}
	
	
	@RequestMapping("findStuById")
	public void findStudentById(Integer stuNo,HttpServletResponse response) throws IOException{
		response.setContentType("text/json;charset=UTF-8");
	    response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());

		//请求头
		response.addHeader( "Access-Control-Allow-Origin", "*" );
		Student stuList=studentService.selectStudentById(stuNo);
		JSONArray jsona = new JSONArray();
		jsona=jsona.fromObject(stuList);
		out.append(jsona.toString());
	}
	
	@RequestMapping("delStudent")
	public void delStudentById(int stuNo,HttpServletResponse response) throws IOException {
		System.out.println("进入了删除方法");
		response.setContentType("text/json;charset=UTF-8");
		//解决跨域问题

	    response.setCharacterEncoding("UTF-8");
		response.addHeader( "Access-Control-Allow-Origin", "*" );
		System.out.println("进入了删除方法");

	    PrintWriter out=response.getWriter();
	    int row=studentService.delStudentById(stuNo);

		 if(row!=0){
			 out.write("success");
		 }else{
			 out.write("error");
		 }
		out.close();
	}
	
	@RequestMapping("addStudent")
	public void AddStudent(Student student,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");
		//解决跨域问题
		response.addHeader( "Access-Control-Allow-Origin","*");
		System.out.println("进入了添加方法");
	    int row=studentService.addStudent(student);
	    PrintWriter out=response.getWriter();

		 if(row!=0){
			 out.write("success");
		 }else{
			 out.write("error");
		 }
		out.close();
	}
	
	/**
	 * 修改学生的方法
	 * @param student
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("updateStudent")
	public void updateStudent(Student student,HttpServletResponse response) throws IOException {
	    response.setCharacterEncoding("UTF-8");
		   System.out.println("进入了修改方法");
		response.setContentType("text/json;charset=UTF-8");
		//解决跨域问题
		response.addHeader( "Access-Control-Allow-Origin","*");
	    PrintWriter out=response.getWriter();
	    int row=studentService.updateStudent(student);
	    System.out.println(row);

		 if(row!=0){
			 out.write("success");
		 }else{
			 out.write("error");
		 }
		out.close();
	}
}
