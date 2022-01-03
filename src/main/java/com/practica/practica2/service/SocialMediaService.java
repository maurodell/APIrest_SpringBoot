package com.practica.practica2.service;

import java.util.List;

import com.practica.practica2.model.SocialMedia;
import com.practica.practica2.model.TeacherSocialMedia;

public interface SocialMediaService {
	void saveSocialMedia(SocialMedia socialMedia);
	void deleteSocialMediaById(Long idSocialMedia);
	void updateSocialMedia(SocialMedia socialMedia);
	List<SocialMedia> findAllSocialMedia();
	SocialMedia findById(Long idSocialMedia);
	SocialMedia findByName(String name);
	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
}
