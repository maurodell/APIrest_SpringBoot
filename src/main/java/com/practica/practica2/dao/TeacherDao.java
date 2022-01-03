package com.practica.practica2.dao;

import java.util.List;

import com.practica.practica2.model.Teacher;

public interface TeacherDao {
	public void saveTeacher(Teacher teacher);
	public void deleteTeacherById(Long idTeacher);
	public void updateTeacher(Teacher teacher);
	public List<Teacher> findAllTeachers();
	public Teacher findById(Long idTeacher);
	public Teacher findByName(String name);
}
