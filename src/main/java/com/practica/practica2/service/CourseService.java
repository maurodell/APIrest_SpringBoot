package com.practica.practica2.service;

import java.util.List;


import com.practica.practica2.model.Course;

public interface CourseService {
	void saveCouse(Course course);
	void deleteCourseById(Long idCourse);
	void updateCouse(Course course);
	List<Course> findAllCouses();
	Course findCouseById(Long idCourse);
	Course findByName(String name);
	List<Course> findByIdTeacher(Long idTeacher);
}
