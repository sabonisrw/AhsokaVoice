package com.AhsokaVoice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.services.ConteoService;

@RestController
@RequestMapping("/addLike")
public class ConteoController {
	@Autowired
	
	ConteoService conteoService;
	
	@PostMapping()
	public ConteoModel agregarLike (@RequestBody ConteoModel like) {
		return this.conteoService.crearLike(like);
	}
}
