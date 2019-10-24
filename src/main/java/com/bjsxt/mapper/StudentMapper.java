package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.userInfo;

public interface StudentMapper{
  @Select("select * from Student")
  List<Student> selectStudentAll(); //查询所有的学生对象

  @Insert("insert into student(stuNo,stuName,stuSex,major,age,score) values(DEFAULT,#{stuName},#{stuSex},#{major},#{age},#{score})")
  public int addStudent(Student stu);		//添加用户的方法

  @Delete("delete  from student where stuNo=#{stuNo}") //通过学生编号删除
  public Integer  delStudentById(int stuNo);
  
  @Update("update student set stuName=#{stuName}, stuSex=#{stuSex}, major=#{major}, age=#{age}, score=#{score} where stuNo=#{stuNo}")
  public Integer updateStudent(Student stu);//修改学生的方法


  @Select("select * from student where stuNo=#{stuNo}") //通过学生编号查询
  Student selectStudentById(int stuNo);
  
  @Select("select * from userInfo where userName=#{userName} and userPwd=#{userPwd}")
  userInfo loginUsers(@Param("userName")String userName ,@Param("userPwd")String userPwd);

  //List<Student> findUsersByPaging(int page,int size);
  List<Student> getStudentByPage(Page page);//分页查询的方法
  @Select("SELECT COUNT(*) FROM student")
  int getAllStudentCount();	//查询学生总数量的方法

}
