package org.jsp.student_crud.controller;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
@Autowired
StudentService service;

@PostMapping("student")
public Student create(@RequestBody Student student) 
{
   return service.save(student);
}

@PostMapping("students")
public List<Student> createMultiple(@RequestBody List<Student>  students) 
{
   return service.save(students);
}

@GetMapping("student")
public Student fetchById(@RequestParam int id) 
{
   return service.fetchById(id);
}

@GetMapping("student/{id}")
public Student fetchById2(@PathVariable int id) 
{
   return service.fetchById(id);
}

@GetMapping("students")
public List<Student> fetchAll()
{
   return service.fetchAll();
}

@GetMapping("studentname/{name}")
public Student fetchByName(@PathVariable String name) 
{
   return service.fetchByName(name);
}

@GetMapping("studentmobile/{mobile}")
public List<Student>  fetchByMobile(@PathVariable long mobile) 
{
   return service.fetchByMobile(mobile);
}

@GetMapping("studentstandard/{std}")
public List<Student> fetchByStandard(@PathVariable int std) {
	 return service.fetchByStandard(std);
}

@GetMapping("student/distinction")
public List<Student> fetchDistinction() {
	 return service.fetchDistinction();
}

@GetMapping("student/firstclass")
public List<Student> fetchFirstClass() {
	 return service.fetchFirstClass();
}

@GetMapping("student/fail")
public List<Student> fetchFail() {
	 return service.fetchFail();
}

@GetMapping("student/english/{marks}")
public List<Student> fetchSubjectMarks(@PathVariable int marks)
{
	 return service.fethEnglish(marks);
}

@GetMapping("student/kannada/{marks}")
public List<Student> fetchKannada(@PathVariable int marks)
{
	 return service.fethKannada(marks);
}

@GetMapping("student/hindi/{marks}")
public List<Student> fetchHindi(@PathVariable int marks)
{
	 return service.fethHindi(marks);
}

@GetMapping("student/science/{marks}")
public List<Student> fetchScience(@PathVariable int marks)
{
	 return service.fethScience(marks);
}

@DeleteMapping("student/{id}")
public Student delete(@PathVariable int id)
{
	return service.delete(id);
}

@PutMapping("student")
public Student update(@RequestBody Student student) 
{
   return service.save(student);
}

}
