package com.AhsokaVoice.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.models.LogroModel;
import com.AhsokaVoice.repositories.ConteoRepository;

@Service

public class ConteoService {

	@Autowired	
	ConteoRepository conteoRepository;
	
	//método para consultar todos los likes registrados
	public ArrayList<ConteoModel> consultarLikes(){
		return (ArrayList<ConteoModel>) conteoRepository.findAll();
	}
	
	//método para crear un nuevo registro de conteo
	public ConteoModel agregarLike (ConteoModel like) {
		return conteoRepository.save(like);
	}
}
