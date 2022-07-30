package com.springdevbootcamp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdevbootcamp.entity.Product;
import com.springdevbootcamp.repo.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRepository prodRepo;

	public Product get(Integer id) {
		return prodRepo.findById(id).get();
	}
}
