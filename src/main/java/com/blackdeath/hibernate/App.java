package com.blackdeath.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.blackdeath.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Teacher teacher = new Teacher("Seth Luis", "avatar");
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();

	}
}
