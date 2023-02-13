package com.example.examvalidation.Controller;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.examvalidation.Entity.Product;
import com.example.examvalidation.Reposite.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository repository;
	  
	@PostMapping("save")
      public ResponseEntity<Product> save(@Valid @RequestBody Product product)
      {
		
	    repository.save(product);
		System.out.println("Product ::"+product);
		return ResponseEntity.ok(product);
      }
	
	@PostMapping("savefile")
	public void savefile(MultipartFile multipartfile) throws IOException
	{
		System.out.println(multipartfile.getOriginalFilename());
		System.out.println(multipartfile.getSize());
		System.out.println(multipartfile.getContentType());
		
		File file=new File("D:\\Txt files\\SpringBootFiles\\"+multipartfile.getOriginalFilename());
		multipartfile.transferTo(file);
	}
}
