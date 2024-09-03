package com.AhsokaVoice.repositories;

import com.AhsokaVoice.models.ConteoModel;
import com.AhsokaVoice.models.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuariosModel, String> {

}
