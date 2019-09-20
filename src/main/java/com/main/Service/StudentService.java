package com.main.Service;

import com.main.Entity.Student;

public interface StudentService {
	
	public void studentEntry(Student student);
	public Student studentSearch(int rno);
	public void studentDelete(int rno);
	public Student studentUpdate(Student student);
}
