package com.example.sale.service.impl;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.sale.dao.ProductDao;
import com.example.sale.dao.ProductImageDao;
import com.example.sale.entity.Productimages;
import com.example.sale.entity.Products;
import com.example.sale.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

	@Autowired
	ServletContext app;
	
	@Autowired
	ProductImageDao piDao; 
	
	@Autowired
	ProductDao pdao;

	@Override
	public File save(MultipartFile file, String folder, Products product) {
		// TODO Auto-generated method stub
// "src\\main\\resources\\static\\upload\\product"
		File dir = new File(folder);

		String absolutePath = dir.getAbsolutePath().toString();
		System.out.println(" >> Path: " + absolutePath);

		String s = System.currentTimeMillis() + file.getOriginalFilename();
		String name = Integer.toHexString(s.hashCode()) + s.substring(s.lastIndexOf("."));

		try {
			File savedFile = new File(dir.getAbsolutePath(), name);
			System.out.println(" >> File just saved: " + savedFile.getAbsolutePath());
			file.transferTo(savedFile);
			System.out.println(" >> File just saved: " + savedFile.getAbsolutePath());
			
			Productimages p = new Productimages();
			p.setName(name);
			p.setProductid(pdao.findById(product.getId()).get());
			piDao.save(p);
			
			return savedFile;
		} catch (Exception e) {
			System.out.println(" >> Error UploadServiceImpl : " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

}
