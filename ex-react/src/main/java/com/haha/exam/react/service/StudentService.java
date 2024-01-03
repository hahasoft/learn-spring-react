package com.haha.exam.react.service;

import java.util.List;

import com.haha.exam.react.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
