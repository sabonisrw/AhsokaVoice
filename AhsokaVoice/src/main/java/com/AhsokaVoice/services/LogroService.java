package com.AhsokaVoice.services;

import java.util.ArrayList;

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

}