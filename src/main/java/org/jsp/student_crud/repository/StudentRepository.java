package org.jsp.student_crud.repository;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{

	Student findByName(String name);

	
	List<Student> findByStandard(int std);

	List<Student> findByResult(String result);


	List<Student> findByMobile(long mobile);

    @Query("select x from Student x where  english>=?1")
	List<Student> fetchEnglish(int marks);

    @Query("select x from Student x where  kannada>=?1")
	List<Student> fetchKannada(int marks);

    @Query("select x from Student x where  hindi>=?1")
	List<Student> fetcHindi(int marks);

    @Query("select x from Student x where  science>=?1")
	List<Student> fetchScience(int marks);









}
