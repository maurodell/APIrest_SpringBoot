package com.practica.practica2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practica.practica2.model.Course;
@Repository
@Transactional
public class CourseImplements extends AbstractSession implements CourseDao{
	

	@Override
	public void saveCouse(Course course) {
		getSession().persist(course);
	}

	@Override
	public void deleteCourseById(Long idCourse) {
		// TODO Auto-generated method stub
		Course course = findCouseById(idCourse);
		if(course != null) {
			getSession().delete(course);
		}
	}

	@Override
	public void updateCouse(Course course) {
		// TODO Auto-generated method stub
		getSession().update(course);
	}

	@Override
	public List<Course> findAllCouses() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Course").list();
	}

	@Override
	public Course findCouseById(Long idCourse) {
		// TODO Auto-generated method stub
		return (Course)getSession().get(Course.class, idCourse);
	}

	@Override
	public Course findByName(String name) {
		// TODO Auto-generated method stub
		return (Course)getSession().createQuery(
				"from Course WHERE name = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		return (List<Course>)getSession().createQuery(
				"from Course c join c.teacher t WHERE t.idTeacher = :idTeacher")
				.setParameter("idTeacher", idTeacher).list();
	}

}
