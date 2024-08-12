package com.AhsokaVoice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhsokaVoice.models.LogroModel;
import com.AhsokaVoice.services.LogroService;

@RestController

@RequestMapping("/logrosAV")

public class LogroController {

	@Autowired
	LogroService logroService;
	
	//regresa todos los logros
	@GetMapping() 
	public ArrayList <LogroModel> consultarLogro(){
		return logroService.consultarLogros();
	}
	
	@PostMapping()
	public LogroModel crearLogro(@RequestBody LogroModel logro) {
		return this.logroService.crearLogro(logro);
	}
}