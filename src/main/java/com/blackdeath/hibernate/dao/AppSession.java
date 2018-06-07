package com.blackdeath.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Seth Luis
 *
 */
public class AppSession {

	private Session session;

	public AppSession() {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		session = sessionFactory.openSession();
		session.beginTransaction();
	}

	public Session getSession() {
		return session;
	}
}
