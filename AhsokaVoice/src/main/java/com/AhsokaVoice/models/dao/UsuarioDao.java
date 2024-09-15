package com.AhsokaVoice.models.dao;



import com.AhsokaVoice.models.Entity.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

// no reconoce la clase usuarioModel a la primerA
public interface UsuarioDao extends CrudRepository<UsuarioModel,Integer> {


}
