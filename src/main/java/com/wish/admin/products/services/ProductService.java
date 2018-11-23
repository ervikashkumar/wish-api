package com.wish.admin.products.services;

import java.util.List;

import com.wish.admin.products.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

}
