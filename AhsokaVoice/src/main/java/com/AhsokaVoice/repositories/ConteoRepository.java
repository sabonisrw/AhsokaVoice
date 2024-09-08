package com.AhsokaVoice.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.models.LogroModel;

@Repository
public interface ConteoRepository extends CrudRepository<ConteoModel, Long> {
	
	public abstract ArrayList <ConteoModel> findByLogro (LogroModel logro);
}
