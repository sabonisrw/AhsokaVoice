package com.AhsokaVoice.services.impl;

import com.AhsokaVoice.models.Entity.UsuarioModel;

public interface UsuarioService{


    UsuarioModel save(UsuarioModel usuarioModel);


    UsuarioModel findById (Integer id);


    Void delete(UsuarioModel usuarioModel);

}
