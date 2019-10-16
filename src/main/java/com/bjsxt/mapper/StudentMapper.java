package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Student;

public interface StudentMapper {
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
  

}
