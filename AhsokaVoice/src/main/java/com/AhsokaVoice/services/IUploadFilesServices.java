package com.AhsokaVoice.services;

import org.springframework.web.multipart.MultipartFile;

public interface IUploadFilesServices {
    String handleFileUpload (MultipartFile file) throws Exception;
}
