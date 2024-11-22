package com.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
	public static void main(String[] args) {

		Configuration crg = new Configuration();
		crg.configure();

		crg.addAnnotatedClass(Student.class);

		SessionFactory factory = crg.buildSessionFactory();
		Session session = factory.openSession();

		Student st = new Student(1, "shweta", 20);
		session.update(st);

		Transaction tra = session.beginTransaction();
		tra.commit();
		System.out.println("Student updated Sucessfully");
	}

}
