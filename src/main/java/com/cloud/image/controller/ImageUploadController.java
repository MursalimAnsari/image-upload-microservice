package com.cloud.image.controller;

import com.cloud.image.service.ImageUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/image")
@RequiredArgsConstructor
public class ImageUploadController {

     private final ImageUploadService imageUploadService;

   @PostMapping
   public ResponseEntity<Map> uplaodImage(@RequestParam("image")MultipartFile file) throws IOException {
       Map imageDate = this.imageUploadService.upload(file);
       return  new ResponseEntity<>(imageDate, HttpStatus.OK);
   }

}
