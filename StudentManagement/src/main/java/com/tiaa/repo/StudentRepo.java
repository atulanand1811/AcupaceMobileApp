package com.tiaa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tiaa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>  {

	@Query(value = "Select s from Student s where s.id = :id")
	Student getStudent(@Param("id") Integer id);
//	
//	@Query(value="Select u from UserModel u where u.userId = :userId")
//	UserModel getRole(@Param("userId") String userId);
	
}
