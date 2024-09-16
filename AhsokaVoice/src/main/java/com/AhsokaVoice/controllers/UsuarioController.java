package com.AhsokaVoice.controllers;

import com.AhsokaVoice.models.Entity.Usuario;
import com.AhsokaVoice.services.iUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private iUsuario clienteService;

    @PostMapping("usuario")
    //PARA AÑADIR UN TIPO DE ESTATUS
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return clienteService.save(usuario);
    }

    @PutMapping("usuario")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public Usuario update(@RequestBody Usuario usuario){
        return clienteService.save(usuario);

    }

    @DeleteMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        Usuario usuarioDelete = clienteService.findById(id);
        clienteService.delete(usuarioDelete);
    }

    @GetMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario showById(@PathVariable Integer id){
        return clienteService.findById(id);
    }
}
