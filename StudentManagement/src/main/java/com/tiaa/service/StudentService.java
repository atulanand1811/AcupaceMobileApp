package com.tiaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiaa.model.Student;
import com.tiaa.repo.StudentRepo;

@Service
public class StudentService {

	
	@Autowired
	StudentRepo repo;
	
	public String addStudent(Student student) {
		
		repo.save(student);
		return "Student Added Successfully";
		
	}
	
	public String deleteStudent(Integer id) {
		repo.deleteById(id);
		return "Student Deleted Successfully";
	}
	
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	public Student getStudent(Integer id) {
		return repo.getStudent(id);
	}
	
	public Student updateStudent(Student st) {
		
		Integer id = st.getId();
		Student existingStudent = getStudent(id);
		existingStudent.setAddress(st.getAddress());
		existingStudent.setEmailId(st.getEmailId());
		existingStudent.setFirstName(st.getFirstName());
		existingStudent.setLastName(st.getLastName());
		existingStudent.setPhoneNumber(st.getPhoneNumber());
		repo.save(existingStudent);
		return existingStudent;
		
	}

}
