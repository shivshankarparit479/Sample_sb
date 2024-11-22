package com.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateStudent {
	public static void main(String[] args) {

		Configuration crg = new Configuration();
		crg.configure();
		crg.addAnnotatedClass(Student.class);

		SessionFactory factory = crg.buildSessionFactory();
		Session session = factory.openSession();

		Student st = new Student(2, "snehal", 19);
		session.saveOrUpdate(st);

		Transaction tra = session.beginTransaction();
		tra.commit();
		System.out.println("Student SaveOrUpdate Sucessfully");
	}

}
