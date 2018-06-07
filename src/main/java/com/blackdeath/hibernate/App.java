package com.blackdeath.hibernate;

import java.util.List;

import com.blackdeath.hibernate.dao.TeacherDaoImpl;
import com.blackdeath.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();

		// Teacher teacher = new Teacher("Freddy Vega", "avatar");
		// teacherDaoImpl.saveTeacher(teacher);

		List<Teacher> teachers = teacherDaoImpl.findAllTeachers();

		for (Teacher t : teachers) {
			System.out.println("Nombre: " + t.getName());
		}

		// Course course = new Course("Java EE", "Tema 1", "Rest API");

	}
}
