package com.wish.admin.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wish.admin.products.domain.Product;

/**
 * Created by Vikash Kumar
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
