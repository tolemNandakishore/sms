package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
