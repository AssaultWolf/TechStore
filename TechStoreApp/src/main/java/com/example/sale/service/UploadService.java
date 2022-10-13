package com.example.sale.service;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.example.sale.entity.Products;

public interface UploadService {

	File save(MultipartFile file, String folder, Products product);

}
