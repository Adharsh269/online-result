package com.marks.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marks.spec.entity.StudentMarks;
import com.marks.spec.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo marksRepo;
	

	public List<StudentMarks> allMarksToDB(List<StudentMarks> marksList) {
		
		return marksRepo.saveAll(marksList);
	}

}
