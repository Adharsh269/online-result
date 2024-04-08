package com.marks.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marks.spec.entity.StudentMarks;
import com.marks.spec.service.StudentService;



@RestController
public class ExamController {
	
	@Autowired
	StudentService examService;

	@PostMapping("/exam/marks/add")
	public List<StudentMarks>  addAllStuMarks(@RequestBody List<StudentMarks> marksList ){
		
		return examService.allMarksToDB(marksList);
	}

}