package com.deva.service;

import java.util.List;

import com.deva.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student,Integer sid);
	public void deleteStudent(Integer stdId);
	public Student getStudent(Integer stdId);
	public List<Student> getAllStudent();
}
