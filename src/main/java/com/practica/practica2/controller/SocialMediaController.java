package com.practica.practica2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practica.practica2.model.SocialMedia;
import com.practica.practica2.service.SocialMediaService;


@Controller
@RequestMapping("/v1")
public class SocialMediaController {
	
	@Autowired
	public SocialMediaService _socialMediaService;
	
	@GetMapping
	public ResponseEntity<List<SocialMedia>> getSocialMedia(){
		List<SocialMedia> socialMedia = new ArrayList<>();
		socialMedia = _socialMediaService.findAllSocialMedia();
		if(socialMedia.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<SocialMedia>>(socialMedia, HttpStatus.OK);
	}
}
