package com.main.Dao;

import com.main.Entity.Student;

public interface StudentDao {
	public void StudentEntry(Student student);
	public Student studentSearch(int rno);
	public void studentDelete(int rno);
	public Student studentUpdate(Student student);
}
