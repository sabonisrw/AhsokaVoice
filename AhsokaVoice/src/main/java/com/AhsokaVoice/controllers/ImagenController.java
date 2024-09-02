package com.AhsokaVoice.controllers;

import com.AhsokaVoice.models.ImageModel;
import com.AhsokaVoice.repositories.ImageRepository;
import com.AhsokaVoice.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController

@RequestMapping("/imagenes")
public class ImagenController {

    @Autowired
    private ImageService imageService;



    @PostMapping("/carga")
    public ResponseEntity<String> cargaImagen(@RequestParam("nombre")String nombre,
                                                @RequestParam("tipo") String tipo,
                                              @RequestParam("archivo") byte[]archivo){
        imageService.guardarImagen(nombre,tipo,archivo);
        return new ResponseEntity<>("imagen subida exitosamente", HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<InputStreamResource> getImage(@PathVariable Long id)throws IOException{
        ImageModel imagenModel = imageService.obtenerImageModel(id);
        if (imagenModel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, imagenModel.getTipo())
                .contentLength(imagenModel.getDatos().length)
                .body(new InputStreamResource(new ByteArrayInputStream(imagenModel.getDatos())));
    }
}
//   @Autowired
//    private ImageRepository imageRepository;
//
//   @GetMapping("/")
//    public String index(){
//       return "upload";
//   }
//
//    @PostMapping("/upload")
//    public String uploadImage(@RequestParam("nombre") String nombre,
//                              @RequestPart("imagen") MultipartFile file,
//                              Model model) {
//        try {
//            ImageModel imagen = new ImageModel();
//            imagen.setNombre(nombre);
//            imagen.setTipo(file.getContentType());
//            imagen.setImagen(file.getBytes());
//
//            imageRepository.save(imagen);
//        } catch (IOException e) {
//            e.printStackTrace();
//            model.addAttribute("message", "Error al subir la imagen");
//            return "upload";
//        }
//
//        model.addAttribute("message", "Imagen subida exitosamente");
//        return "upload";
//    }


