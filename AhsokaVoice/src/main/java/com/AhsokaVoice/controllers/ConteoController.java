package com.AhsokaVoice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.models.LogroModel;
import com.AhsokaVoice.services.ConteoService;

@RestController
@RequestMapping("/addLike")
public class ConteoController {
	@Autowired
	
	ConteoService conteoService;
	
	//regresa todos los logros
	@GetMapping() 
	public ArrayList<ConteoModel> consultarLikes(){
		return conteoService.consultarLikes();
	}
	
	@PostMapping()
	public ConteoModel agregarLike (@RequestBody ConteoModel like) {
		return this.conteoService.agregarLike(like);
	}
}
