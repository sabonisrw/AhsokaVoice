package com.AhsokaVoice.services.impl;

import com.AhsokaVoice.models.Entity.Usuario;
import com.AhsokaVoice.models.dao.UsuarioDao;
import com.AhsokaVoice.services.iUsuario;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioImpl implements iUsuario {

    //inyeccion de dependencias
    @Autowired
    private UsuarioDao usuarioDao;

    //Excepciones por defecto
    @Transactional
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }


    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);

    }
}
