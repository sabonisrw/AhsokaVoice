package com.AhsokaVoice.services.impl;


import com.AhsokaVoice.services.IUploadFilesServices;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
@Service
public class UploadFilesServiceimpl implements IUploadFilesServices {


    @Override
    public String handleFileUpload(MultipartFile file) throws Exception {
        try{
            String fileName = UUID.randomUUID().toString();
            byte[] bytes = file.getBytes();
            String  fileOriginalName = file.getOriginalFilename();

            long fileSize = file.getSize();
            long maxFileSize = 5 *1024 * 1024;

            if (fileSize> maxFileSize){
                return "File size must be less than 5MB";

            }

            if (
                    !fileOriginalName.endsWith(".jpg") &&
                            !fileOriginalName.endsWith(".jpge") &&
                            !fileOriginalName.endsWith(".png")

            ){
                return "Only JPG, JPGE, PNG ALLOWED";
            }

            String fileExtension = fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
            String newFileName = fileName + fileExtension;

            File folder  = new File("src/main/resources/pictures/");
            if (!folder.exists()){
                folder.mkdirs();
            }
            Path path = Paths.get("src/main/resources/pictures/" + newFileName);
            Files.write(path, bytes);
            return  "file upload succesfull";



        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
