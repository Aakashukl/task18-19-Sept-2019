package com.main.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.Entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void StudentEntry(Student student) {
		
		Session session  = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}

	public Student studentSearch(int rno) {
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class,rno);
		session.close();
		return student;
	}

	public void studentDelete(int rno) {
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class,rno);
		Transaction transaction = session.beginTransaction();
		session.delete(student);
		transaction.commit();
		session.close();
	}

	public Student studentUpdate(Student student) {
		Session session  = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();
		return student;
	}

}
