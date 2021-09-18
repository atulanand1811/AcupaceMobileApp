package com.tiaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiaa.model.Student;
import com.tiaa.service.StudentService;

@RestController()
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		String res = service.addStudent(student);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){		
		String res = service.deleteStudent(id);
		return new ResponseEntity<String>(res,HttpStatus.OK);		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> students = service.getStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id){
		Student st = service.getStudent(id);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student st){
		Student student = service.updateStudent(st);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
}
//1.Post
//2.Get
//3.Delete
//4.Put