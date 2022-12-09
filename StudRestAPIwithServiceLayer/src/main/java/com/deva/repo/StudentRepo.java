package com.deva.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}