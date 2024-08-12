package com.AhsokaVoice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.repositories.ConteoRepository;

@Service

public class ConteoService {

	@Autowired	
	ConteoRepository conteoRepository;
	
	//método para crear un nuevo registro de conteo
	public ConteoModel crearLike (ConteoModel like) {
		return conteoRepository.save(like);
	}
}
