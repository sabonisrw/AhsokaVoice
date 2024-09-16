package com.AhsokaVoice.models.dao;



import com.AhsokaVoice.models.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;
//CrudRepository reemplaza el JPARepository y trae los metodos de un CRUD
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

}
