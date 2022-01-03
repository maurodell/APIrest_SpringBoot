package com.practica.practica2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.practica2.dao.SocialMediaDao;
import com.practica.practica2.model.SocialMedia;
import com.practica.practica2.model.TeacherSocialMedia;

@Service("socialMediaService")
@Transactional
public class SocialMediaServiceImp implements SocialMediaService{
	
	@Autowired
	private SocialMediaDao _socialMediaDao;
	
	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.saveSocialMedia(socialMedia);
	}

	@Override
	public void deleteSocialMediaById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.deleteSocialMediaById(idSocialMedia);
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.updateSocialMedia(socialMedia);
	}

	@Override
	public List<SocialMedia> findAllSocialMedia() {
		// TODO Auto-generated method stub
		return _socialMediaDao.findAllSocialMedia();
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findById(idSocialMedia);
	}

	@Override
	public SocialMedia findByName(String name) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findByName(name);
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findSocialMediaByIdAndName(idSocialMedia, nickname);
	}

}
