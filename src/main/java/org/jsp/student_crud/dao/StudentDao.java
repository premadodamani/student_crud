package org.jsp.student_crud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDao {
	
	@Autowired
	StudentRepository repository;
	
	public Student save(Student student) {
		return repository.save(student);
	}
	
	public List<Student> save(List<Student> students){
		return repository.saveAll(students);
	}

//	public Student fetchById(int id) {
//	
//		Optional<Student> optional=repository.findById(id);//it is same like list but it will give only one data,it is a class 
//	if(optional.isEmpty()) 
//	{
//		return null;
//	}else
//		return optional.get();
//	
//	}
	
	public Student fetchById(int id)
	{
		return repository.findById(id).get();
	}

	public List<Student> fetchAll() {
	
		return repository.findAll();
	}

	public Student fetchByName() {
	
		return null;
	}

	public Student fetchByName(String name) {
		return repository.findByName(name);
	}

	
	public List<Student> fetchByStandard(int std) {
		return repository.findByStandard(std);
	}

	
	

	public List<Student> fetchResult(String result) {
		// TODO Auto-generated method stub
		return repository.findByResult(result);
	}

	public List<Student> fetchByMobile(long mobile) {
		// TODO Auto-generated method stub
		return repository.findByMobile(mobile);
	}

	
	public List<Student> fetchEnglish(int marks) {
		// TODO Auto-generated method stub
		 return repository.fetchEnglish(marks);
	}

	public List<Student> fetchKannada(int marks) {
		// TODO Auto-generated method stub
		return repository.fetchKannada(marks);
	}

	public List<Student> fetcHindi(int marks) {
		// TODO Auto-generated method stub
		return repository.fetcHindi(marks);
	}

	public List<Student> fetcScience(int marks) {
		// TODO Auto-generated method stub
		return repository.fetchScience(marks);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}



}
