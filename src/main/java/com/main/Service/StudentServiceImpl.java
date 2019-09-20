package com.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.Dao.StudentDao;
import com.main.Entity.Student;

@Service
@ComponentScan(basePackages = "com.main.Service")

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public void studentEntry(Student student) {
		
		studentDao.StudentEntry(student);
	}

	public Student studentSearch(int rno) {
		
		return studentDao.studentSearch(rno);
	}

	public void studentDelete(int rno) {
		studentDao.studentDelete(rno);
		
	}

	public Student studentUpdate(Student student) {
		return studentDao.studentUpdate(student);		
	}
	
	
	
	
}