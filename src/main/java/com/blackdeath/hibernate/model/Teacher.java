package com.blackdeath.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Seth Luis
 *
 */
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	private static final long serialVersionUID = 4633060592594067378L;

	@Id
	@Column(name = "id_teacher")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeacher;
	@Column(name = "name")
	private String name;
	@Column(name = "avatar")
	private String avatar;

	public Teacher() {

	}

	public Teacher(String name, String avatar) {
		super();
		this.name = name;
		this.avatar = avatar;
	}

	public Long getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Long idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
