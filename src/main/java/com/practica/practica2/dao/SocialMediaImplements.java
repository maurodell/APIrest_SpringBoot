package com.practica.practica2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practica.practica2.model.SocialMedia;
import com.practica.practica2.model.TeacherSocialMedia;

@Repository
@Transactional
public class SocialMediaImplements extends AbstractSession implements SocialMediaDao{

	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		getSession().persist(socialMedia);
	}

	@Override
	public void deleteSocialMediaById(Long idSocialMedia) {
		SocialMedia socialM = findById(idSocialMedia);
		if(socialM != null) {
			getSession().delete(socialM);
		}
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		getSession().update(socialMedia);
	}

	@Override
	public List<SocialMedia> findAllSocialMedia() {
		return getSession().createQuery("from SocialMedia").list();
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		return (SocialMedia)getSession().get(SocialMedia.class, idSocialMedia);
	}

	@Override
	public SocialMedia findByName(String name) {
		return (SocialMedia)getSession().createQuery(
				"from SocialMedia WHERE name = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
		List<Object[]> objects = getSession().createQuery(
				"from TeacherSocialMedia tsm join tsm.SocialMedia sm "
				+ "WHERE sm.idSocialMedia = :idSocialMedia and tsm.nickname = :nickname")
				.setParameter("idSocialMedia", idSocialMedia)
				.setParameter("nickname", nickname).list();
		
		
		if(objects.size() > 0) {
			for (Object[] object3 : objects) {
				for (Object object2 : object3) {
					if(object2 instanceof TeacherSocialMedia) {
						return (TeacherSocialMedia) object2;
					}
				}
			}
		}
		return null;
	}

}
