package com.AhsokaVoice.services;

import java.util.List;


public interface UsuarioService  {

UsuariosModel saveUsuariosModel(UsuariosModel usuariosModel);

List<UsuariosModel> getAllUsuariosModels();

UsuariosModel getUsuariosModel(String usuarioId);


}
