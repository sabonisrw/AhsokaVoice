package com.AhsokaVoice.services;


import com.AhsokaVoice.models.ImageModel;
import com.AhsokaVoice.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public ImageModel guardarImagen(String nombre, String tipo, byte[] datos){
        ImageModel imageModel = new ImageModel();
        imageModel.setNombre(nombre);
        imageModel.setTipo(tipo);
        imageModel.setDatos(datos);
        return  imageRepository.save(imageModel);
    }
    public ImageModel obtenerImageModel(Long id){
        return imageRepository.findById(id).orElse(null);
    }
}

