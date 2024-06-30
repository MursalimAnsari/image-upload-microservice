package com.cloud.image.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface ImageUploadService {
    public Map upload(MultipartFile file) throws IOException;

}
