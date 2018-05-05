package com.cloudinary.upload.controller;

import com.cloudinary.upload.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Upload {

    @Autowired
    private CloudinaryService cloudinaryService;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String url = cloudinaryService.uploadFile(file);
        return "File uploaded successfully: File path :  " + url;
    }
}
