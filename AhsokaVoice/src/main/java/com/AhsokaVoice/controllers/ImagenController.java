package com.AhsokaVoice.controllers;

import com.AhsokaVoice.models.ImageModel;
import com.AhsokaVoice.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;

@Controller


public class ImagenController {

   @Autowired
    private ImageRepository imageRepository;

   @GetMapping("/")
    public String index(){
       return "upload";
   }

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("nombre") String nombre,
                              @RequestPart("imagen") MultipartFile file,
                              Model model) {
        try {
            ImageModel imagen = new ImageModel();
            imagen.setNombre(nombre);
            imagen.setTipo(file.getContentType());
            imagen.setImagen(file.getBytes());

            imageRepository.save(imagen);
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "Error al subir la imagen");
            return "upload";
        }

        model.addAttribute("message", "Imagen subida exitosamente");
        return "upload";
    }
}

