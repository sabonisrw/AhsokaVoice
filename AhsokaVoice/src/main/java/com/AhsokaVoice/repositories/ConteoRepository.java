package com.AhsokaVoice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AhsokaVoice.models.ConteoModel;

@Repository
public interface ConteoRepository extends CrudRepository<ConteoModel, Long> {

}
