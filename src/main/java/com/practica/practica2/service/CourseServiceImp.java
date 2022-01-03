package com.practica.practica2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.practica2.dao.CourseDao;
import com.practica.practica2.model.Course;

@Service("courseService")
@Transactional
public class CourseServiceImp implements CourseService{
	
	@Autowired
	private CourseDao _courseDao;
	
	@Override
	public void saveCouse(Course course) {
		// TODO Auto-generated method stub
		_courseDao.saveCouse(course);
	}

	@Override
	public void deleteCourseById(Long idCourse) {
		// TODO Auto-generated method stub
		_courseDao.deleteCourseById(idCourse);
	}

	@Override
	public void updateCouse(Course course) {
		// TODO Auto-generated method stub
		_courseDao.updateCouse(course);
	}

	@Override
	public List<Course> findAllCouses() {
		// TODO Auto-generated method stub
		return _courseDao.findAllCouses();
	}

	@Override
	public Course findCouseById(Long idCourse) {
		// TODO Auto-generated method stub
		return _courseDao.findCouseById(idCourse);
	}

	@Override
	public Course findByName(String name) {
		// TODO Auto-generated method stub
		return _courseDao.findByName(name);
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		return _courseDao.findByIdTeacher(idTeacher);
	}

}
