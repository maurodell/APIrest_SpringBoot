package com.practica.practica2.dao;

import java.util.List;

import com.practica.practica2.model.SocialMedia;
import com.practica.practica2.model.TeacherSocialMedia;

public interface SocialMediaDao {
	public void saveSocialMedia(SocialMedia socialMedia);
	public void deleteSocialMediaById(Long idSocialMedia);
	public void updateSocialMedia(SocialMedia socialMedia);
	public List<SocialMedia> findAllSocialMedia();
	public SocialMedia findById(Long idSocialMedia);
	public SocialMedia findByName(String name);
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
}
