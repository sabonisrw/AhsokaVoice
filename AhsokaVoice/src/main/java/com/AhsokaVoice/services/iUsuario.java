package com.AhsokaVoice.services;

import com.AhsokaVoice.models.Entity.Usuario;

public interface iUsuario {

    Usuario save(Usuario usuario);


    Usuario findById(Integer id);


    void delete(Usuario usuario);
}
