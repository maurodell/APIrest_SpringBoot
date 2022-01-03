package com.practica.practica2.dao;

import java.util.List;


import com.practica.practica2.model.Course;

public interface CourseDao {
	public void saveCouse(Course course);
	public void deleteCourseById(Long idCourse);
	public void updateCouse(Course course);
	public List<Course> findAllCouses();
	public Course findCouseById(Long idCourse);
	public Course findByName(String name);
	public List<Course> findByIdTeacher(Long idTeacher);
}
