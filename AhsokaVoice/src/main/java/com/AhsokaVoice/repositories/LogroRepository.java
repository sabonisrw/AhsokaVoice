package com.AhsokaVoice.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.AhsokaVoice.models.LogroModel;


@Repository
public interface LogroRepository extends CrudRepository <LogroModel, Long> {

}
