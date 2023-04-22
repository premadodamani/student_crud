package org.jsp.student_crud.service;

import java.util.List;

import org.jsp.student_crud.dao.StudentDao;
import org.jsp.student_crud.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public Student save(Student student) 
	{
		
		int maths=student.getMathematics();
		int science=student.getScience();
		int english=student.getEnglish();
		int hindi=student.getHindi();
		int kannada=student.getKannada();
		int sociel=student.getSocile();
		
		double percentage=(maths+english+hindi+kannada+science+sociel)/6;
		
		student.setPercentage(percentage);
		if(maths<35||science<35||kannada<35||hindi<35||sociel<35)
		{
			student.setResult("Fail");
		}
		else {
			if(percentage<35) {
				student.setResult("Fail");
			}
			else if(percentage<60) {
				student.setResult("Second Class");
			}
			else if (percentage<85) {
				student.setResult("First Class");
			}
			else {
				student.setResult("Distinction");
			}
		}
		return dao.save(student);
	}

	public List<Student> save(List<Student> students) {
		for(Student student:students) {
			
			int maths=student.getMathematics();
			int science=student.getScience();
			int english=student.getEnglish();
			int hindi=student.getHindi();
			int kannada=student.getKannada();
			int sociel=student.getSocile();
			
			double percentage=(maths+english+hindi+kannada+science+sociel)/6;
			
			student.setPercentage(percentage);
			if(maths<35||science<35||kannada<35||hindi<35||sociel<35)
			{
				student.setResult("Fail");
			}
			else {
				if(percentage<35) {
					student.setResult("Fail");
				}
				else if(percentage<60) {
					student.setResult("Second Class");
				}
				else if (percentage<85) {
					student.setResult("First Class");
				}
				else {
					student.setResult("Distinction");
				}
			}
			
		}
		return dao.save(students);
		}

	public Student fetchById(int id) {
		
		return dao.fetchById(id);
	}

	public Student fetchById2(int id) {
	
		return dao.fetchById(id);
	}

	public List<Student> fetchAll() {

		return dao.fetchAll();
	}

	public Student fetchByName(String name) {
		return dao.fetchByName(name);
		
	}

	public List<Student> fetchByMobile(long mobile) {
		return dao.fetchByMobile(mobile);
	}

//	public List<Student>  fetchByStandard(int std) {
//		return dao.fetchByStandard(std);
//	}

	public List<Student> fetchByStandard(int std) {
		return dao.fetchByStandard(std);
	}

	

	public List<Student> fetchDistinction() {
		
		return dao.fetchResult("distinction");
	}

public List<Student> fetchFirstClass() {
		
		return dao.fetchResult("First class");
	}
public List<Student> fetchFail() {
	
	return dao.fetchResult("Fail");
}


public List<Student> fethEnglish(int marks) {
	// TODO Auto-generated method stub
	return dao.fetchEnglish(marks);


}

public List<Student> fethKannada(int marks) {
	// TODO Auto-generated method stub
	return dao.fetchKannada(marks);
}

public List<Student> fethHindi(int marks) {
	// TODO Auto-generated method stub
	return dao.fetcHindi(marks);
}

public List<Student> fethScience(int marks) {
	// TODO Auto-generated method stub
	return dao.fetcScience(marks);
}

public Student delete(int id) {
 Student student=dao.fetchById(id);
	 dao.delete(id);
	 return student;
}
}




















