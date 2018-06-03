package com.blackdeath.hibernate.dao;

import java.util.List;

import com.blackdeath.hibernate.model.Teacher;

/**
 * @author Seth Luis
 *
 */
public interface TeacherDao {
	void saveTeacher(Teacher teacher);

	void deleteTeacherById(Long idTeacher);

	void updateTeacher(Teacher teacher);

	List<Teacher> findAllTeachers();

	Teacher findById(Long idTeacher);

	Teacher findByName(String name);
}
