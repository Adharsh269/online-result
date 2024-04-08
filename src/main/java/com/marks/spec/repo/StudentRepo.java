package com.marks.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marks.spec.entity.StudentMarks;

public interface StudentRepo extends JpaRepository<StudentMarks,Integer>{

}
