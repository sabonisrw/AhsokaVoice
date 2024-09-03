package com.AhsokaVoice.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhsokaVoice.models.LogroModel;
import com.AhsokaVoice.repositories.LogroRepository;
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
	
	//método para actualizar un logro 
	/*@PutMapping("/update/{id}")
	public LogroModel actualizarLogro(@PathVariable("id") Long id, @RequestBody LogroModel logro) {
		Optional<LogroModel> logroActual = logroService.consultarPorId(id);
		logroActual.setTitulo(logro.getTitulo());
		logroActual.setArea(logro.getArea());
		logroActual.setDescripcion(logro.getDescripcion());
		return logroService.crearLogro(logroActual);
		
	}*/

	@PutMapping(path="/update/{id}") 
	public String updateLogro(@PathVariable("id") Long id, @RequestBody LogroModel logro) {
		logroService.updateLogro(logro);
		return "Se actualizó logro";
	}
	
	@PutMapping(path="/updatev2/{id}") 
	public LogroModel updateLogrov2(@PathVariable("id") Long id, @RequestBody LogroModel logro) {
		return logroService.updateLogrov2(logro);		
	}
	
	@PatchMapping(path="/ocultar/{id}/{value}")
	public LogroModel ocultarLogro(@PathVariable Long id,@PathVariable boolean value) {
			LogroModel logroOculto = logroService.consultarPorId(id).get();
			logroOculto.setOcultar(value);
			return logroService.updateLogrov2(logroOculto);			
	}

}