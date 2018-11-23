package com.wish.admin.products.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.admin.products.domain.Product;
import com.wish.admin.products.repositories.ProductRepository;

/**
 * Created by Vikash Kumar
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Product getById(Long id) {
       // return productRepository.findOne(id);
    	return null;
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
       // productRepository.delete(id);

    }
}
