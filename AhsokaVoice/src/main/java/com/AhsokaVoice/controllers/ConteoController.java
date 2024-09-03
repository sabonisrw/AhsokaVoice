package com.AhsokaVoice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//contabiliza los likes recibidos
	@GetMapping("/conteoLikes") 
	public long contarLikes(@RequestParam("logro") LogroModel logro){
		return this.conteoService.contarLikes(logro).size();
	}
	
	@DeleteMapping( path = "/{id}")
	public String eliminarPorId (@PathVariable("id") Long id) {
		boolean ok = this.conteoService.eliminarLikes(id);
		if (ok) {
			return "Se eliminó el like con id " +id;
		}else{
			return "No se pudo eliminar el like con id " + id;
		}
	}	

}
