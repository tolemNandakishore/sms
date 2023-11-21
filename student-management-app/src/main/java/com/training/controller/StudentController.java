package com.training.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.MapBindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.entity.Student;
import com.training.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository   studentRepository;

	@RequestMapping("/add-student")
	public String addStudent(Student student,  Map model) {
		studentRepository.save(student);
		model.put("message","Record added Successfully..!!");
		return "index.jsp";

	}
	@RequestMapping("/view-student")
	public String showAllStudents(Map model) {
		List<Student>list=studentRepository.findAll();
		model.put("student", list);
		return "view.jsp";
	}
	@RequestMapping("/delete-student")
	public String delete(@RequestParam int rollNo, Map model) {
		studentRepository.deleteById(rollNo);
		model.put("message","Record Deleted Successfully..!!");

		return "index.jsp";
	}

	@RequestMapping("/edit-student")
	public String edit(@RequestParam int rollNo, Map model) {
		Student student=studentRepository.findById(rollNo).get();
		model.put("student", student);
		return "editStudent.jsp";

	}
	@RequestMapping("/update-student")
	public String updateStudent(Student student,  Map model) {
		studentRepository.save(student);
		model.put("message","Record added Successfully..!!");
		return "index.jsp";

	}


}
