package com.AhsokaVoice.services.impl;


import com.AhsokaVoice.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService implements com.AhsokaVoice.services.UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuariosModel saveUsuariosModel(UsuariosModel usuariosModel){
        String randomUsuarioId = UUID.randomUUID().toString();
        usuariosModel.setUsuarioId(Long.valueOf(randomUsuarioId));
        return  usuarioRepository.save(usuariosModel);
         }
@Override
    public List<UsuariosModel> getAllUsuariosModels(){
        return  usuarioRepository.findAll();
}

@Override
    public  UsuariosModel getUsuariosModel(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow();
}

    }