package com.AhsokaVoice.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path="/{id}")
	public Optional <LogroModel> consultarPorId(@PathVariable("id") Long id){
		return this.logroService.consultarPorId(id);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.logroService.eliminarLogro(id);
		if (ok) {
			return "Se eliminó el logro con el id " +id; 			
		}else {
			return "No pudo eliminarse el logro con el id " +id;
		}
			
	}
}