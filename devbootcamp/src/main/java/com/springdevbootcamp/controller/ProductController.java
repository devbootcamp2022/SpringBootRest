package com.springdevbootcamp.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdevbootcamp.entity.Product;
import com.springdevbootcamp.repo.ProductRepository;
import com.springdevbootcamp.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductService productService;

	
	 @GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Product> getAllProducts() { return productRepository.findAll(); }
	 

	
	@GetMapping(path = "/products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id){
		
		try {
			 
			  Product product = productService.get(id);
			  return new ResponseEntity<Product>(product, HttpStatus.OK);
			
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(path = "/products")
	public ResponseEntity<Product> create(@RequestBody Product product){		
		try {			  
			  Product product1 = productService.save(product);
			  return new ResponseEntity<Product>(product1, HttpStatus.OK);
			
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	  @DeleteMapping (path = "/products/{id}")
	  public String  deleteProduct(@PathVariable Integer id){ 
		   try {
			     productService.delete(id);
	             return "deleted successfully";
	       }catch (Exception e) { 
	    	       e.printStackTrace();
	               return "issue in deleting"; 
	       }
	 }
	 
		
				
		
	

}
