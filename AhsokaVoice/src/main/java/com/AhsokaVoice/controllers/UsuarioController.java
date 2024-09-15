package com.AhsokaVoice.controllers;

import com.AhsokaVoice.models.Entity.UsuarioModel;
import com.AhsokaVoice.services.impl.UsuarioService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("usuario")
    public UsuarioModel create(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.save(usuarioModel);
    }

    @PutMapping("usuario")
    public UsuarioModel update(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.save(usuarioModel);
    }

    @DeleteMapping("usuario/{id}")
    public void delete(@PathVariable Integer id){
       UsuarioModel usuarioDelete  = usuarioService.findById(id);
       usuarioService.delete(usuarioDelete);
    }

    @GetMapping("usuario/{id}")
    public UsuarioModel showById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }

}
