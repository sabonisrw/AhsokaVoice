package com.AhsokaVoice.services;

import com.AhsokaVoice.models.UsuariosModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface UsuarioService  {

UsuariosModel saveUsuariosModel(UsuariosModel usuariosModel);

List<UsuariosModel> getAllUsuariosModels();

UsuariosModel getUsuariosModel(String usuarioId);


//    UsuariosModel create(UsuariosModel usuariosModel);
//
//    List<UsuariosModel> getAll();
//
//    UsuariosModel get(String usuarioId);
}
