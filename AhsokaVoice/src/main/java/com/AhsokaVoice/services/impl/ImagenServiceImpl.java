package com.AhsokaVoice.services.impl;

import com.AhsokaVoice.services.ImagenServices;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class ImagenServiceImpl implements ImagenServices {


    public String manejoImagenes(MultipartFile file) throws Exception {
       try{
           String fileName = UUID.randomUUID().toString();
           byte[] bytes = file.getBytes();
           String fileOriginalName = file.getOriginalFilename();

           long fileSize = file.getSize();
           long maxFileSize = 5 * 1024 * 1024;
            if(fileSize > maxFileSize){
                 return "El archivo debe de ser menor a 5MB";

       }

            if (
                    !fileOriginalName.endsWith(".jpg") &&
                    !fileOriginalName.endsWith(".jpge")&&
                    !fileOriginalName.endsWith(".png") )
            {
                return  "solo archivos .jpg, .jpge y png permitidos";
            }
            String fileExtension = fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
            String newFileName = fileName + fileExtension;

            File folder = new File("AhsokaVoice/src/main/resources/imagenes/");
            if (!folder.exists()){
                folder.mkdirs();

            }
           Path path = Paths.get("src/main/resources/imagenes/" + newFileName);
           Files.write(path, bytes);
           return "archivo cargado exitosamente";

       } catch (Exception e){
                throw new Exception(e.getMessage());
       }

    }
    }