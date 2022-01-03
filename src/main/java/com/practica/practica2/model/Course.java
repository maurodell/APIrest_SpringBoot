package com.practica.practica2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable {
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCouse;
	
	@Column(name="name")
	private String name;
	
	@Column(name="themes")
	private String themes;
	
	@Column(name="proyect")
	private String proyect;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="teacher")
	private Teacher teacher;
	
	
	
	public Course(String name, String themes, String proyect, Teacher teacher) {
		super();
		this.name = name;
		this.themes = themes;
		this.proyect = proyect;
		this.teacher = teacher;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCouse() {
		return idCouse;
	}

	public void setIdCouse(Long idCouse) {
		this.idCouse = idCouse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public String getProyect() {
		return proyect;
	}

	public void setProyect(String proyect) {
		this.proyect = proyect;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
