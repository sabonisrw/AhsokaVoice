package com.AhsokaVoice.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AhsokaVoice.models.LogroModel;
import com.AhsokaVoice.repositories.LogroRepository;

@Service

public class LogroService {

	@Autowired
	LogroRepository logroRepository; 


	//método para consultar todos los logros registrados
	public ArrayList <LogroModel> consultarLogros(){
		return (ArrayList <LogroModel>) logroRepository.findAll();
	}
	
	//método para crear un logro
	public LogroModel crearLogro (LogroModel logro) {
		return logroRepository.save(logro);
	}

	public Optional <LogroModel> consultarPorId(Long id){
		return logroRepository.findById(id);
	}
	
	public boolean eliminarLogro(Long id) {
		try {
			logroRepository.deleteById(id);
			return true;
		}catch (Exception err){
			return false;
		}
	}
	
	public String updateLogro (LogroModel logro) {
		logroRepository.save(logro);
		return "Success";
	}
	
	public LogroModel updateLogrov2 (LogroModel logro) {
		return logroRepository.save(logro);		
	}
}