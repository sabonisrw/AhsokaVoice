package com.AhsokaVoice.controllers;


import com.AhsokaVoice.services.ImagenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequestMapping("/subida")

public class ImagenController {

    @Autowired
    ImagenServices imagenServices;


    @PostMapping("/imagen")
    private ResponseEntity<String> subidaImagen(@RequestParam("archivo") MultipartFile file)throws Exception
    {
        return new ResponseEntity<>(ImagenServices.manejoImagenes(file), HttpStatus.OK);
    }
}