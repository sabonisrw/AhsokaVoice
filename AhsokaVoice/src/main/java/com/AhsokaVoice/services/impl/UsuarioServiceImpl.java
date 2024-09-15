package com.AhsokaVoice.services.impl;

import com.AhsokaVoice.models.Entity.UsuarioModel;
import com.AhsokaVoice.models.dao.UsuarioDao;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Entity
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;
    private Integer id;


    @Transactional
    @Override
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioDao.save(usuarioModel);
    }
    @Transactional(readOnly = true)
    @Override
    public UsuarioModel findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public Void delete(UsuarioModel usuarioModel) {
        usuarioDao.delete(usuarioModel);
        return null;
    }
}
