package com.blackdeath.hibernate.dao;

import java.util.List;

import com.blackdeath.hibernate.model.Teacher;

/**
 * @author Seth Luis
 *
 */
public class TeacherDaoImpl extends AppSession implements TeacherDao {

	private AppSession session;

	public TeacherDaoImpl() {
		session = new AppSession();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		session.getSession().persist(teacher);
		session.getSession().getTransaction().commit();
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacher> findAllTeachers() {
		return session.getSession().createQuery("FROM Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
