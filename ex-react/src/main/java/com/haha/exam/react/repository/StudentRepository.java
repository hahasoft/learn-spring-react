package com.haha.exam.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haha.exam.react.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
