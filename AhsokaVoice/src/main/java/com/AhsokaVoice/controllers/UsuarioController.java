package com.AhsokaVoice.controllers;


import com.AhsokaVoice.models.UsuariosModel;
import com.AhsokaVoice.services.UsuarioService;
import com.AhsokaVoice.services.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<UsuariosModel> guardarUsuario(@RequestBody UsuariosModel usuariosModelRequest){
        UsuariosModel usuariosModel = usuarioService.saveUsuariosModel(usuariosModelRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosModel);
    }
@GetMapping("/{usuarioId}")
    public ResponseEntity<UsuariosModel> obtenerUsuario(@PathVariable String usuaioId){
        UsuariosModel usuariosModel = usuarioService.getUsuariosModel(usuaioId);
        return  ResponseEntity.ok(usuariosModel);
    }
@GetMapping
    public  ResponseEntity<List<UsuariosModel>> listarUsuarios(){
        List<UsuariosModel> usuariosModels = usuarioService.getAllUsuariosModels();
        return ResponseEntity.ok(usuariosModels);
}

}
