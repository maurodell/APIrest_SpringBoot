package com.practica.practica2.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="teacher")
public class Teacher implements Serializable{
	@Id
	@Column(name="id_teacher")
	private Long idTeacher;
	@Column(name="name")
	private String name;
	@Column(name="avatar")
	private String avatar;
	@OneToMany(mappedBy="teacher")
	private Set<Course> courses;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_teacher")
	private Set<TeacherSocialMedia> teacherSocialMedia;
	
	public Teacher(String name, String avatar) {
		super();
		this.name = name;
		this.avatar = avatar;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Set<TeacherSocialMedia> getTeacherSocialMedia() {
		return teacherSocialMedia;
	}
	public void setTeacherSocialMedia(Set<TeacherSocialMedia> teacherSocialMedia) {
		this.teacherSocialMedia = teacherSocialMedia;
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
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
