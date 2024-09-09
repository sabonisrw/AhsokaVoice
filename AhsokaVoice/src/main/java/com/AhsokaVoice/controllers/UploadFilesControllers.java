package com.AhsokaVoice.controllers;

import com.AhsokaVoice.services.IUploadFilesServices;
//import com.subida.archivos.services.IUploadFilesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadFilesControllers {

    @Autowired
    IUploadFilesServices uploadFilesServices;

    @PostMapping("/pictures")
    private ResponseEntity<String> uploadPic(MultipartFile file) throws Exception {
        return  new ResponseEntity<>(uploadFilesServices.handleFileUpload(file), HttpStatus.OK);
    }
}
