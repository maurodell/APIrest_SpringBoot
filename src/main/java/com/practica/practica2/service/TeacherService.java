package com.practica.practica2.service;

import java.util.List;

import com.practica.practica2.model.Teacher;

public interface TeacherService {
	void saveTeacher(Teacher teacher);
	void deleteTeacherById(Long idTeacher);
	void updateTeacher(Teacher teacher);
	List<Teacher> findAllTeachers();
	Teacher findById(Long idTeacher);
	Teacher findByName(String name);
}
