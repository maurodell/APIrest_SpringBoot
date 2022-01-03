package com.practica.practica2.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practica.practica2.model.Teacher;
import com.practica.practica2.model.TeacherSocialMedia;
@Repository
@Transactional
public class TeacherImplement extends AbstractSession implements TeacherDao {

	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getSession().persist(teacher);
		
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		Teacher teacher = findById(idTeacher);
		if(teacher != null) {
			
			//esto es para que se eliminen las redes sociales y luego elimino al Teacher
			Iterator<TeacherSocialMedia> i = teacher.getTeacherSocialMedia().iterator();
			while(i.hasNext()) {
				TeacherSocialMedia teacherSocialMedia = i.next();
				i.remove();
				getSession().delete(teacherSocialMedia);
			}
			teacher.getTeacherSocialMedia().clear();
			
			//acá elimino el Teacher
			getSession().delete(teacher);
		}
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getSession().update(teacher);
	}

	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return (Teacher)getSession().get(Teacher.class, idTeacher);
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return (Teacher)getSession().createQuery(
				"from Teacher WHERE name = :name")
				.setParameter("name", name).uniqueResult();
	}

}
