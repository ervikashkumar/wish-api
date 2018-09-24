package com.wish.admin.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author vikash kumar
 * Controller related to product modules
 */
@RestController
public class ProductController {
	/**
	 * 
	 * @return ResponseEntity
	 * Dummy method to fetch the List of products
	 */
	@RequestMapping(value="/products")
	public ResponseEntity getProducts(){
		List productList = new ArrayList<>();
		productList.add("TV");
		productList.add("Fridge");
		productList.add("Radio");
		productList.add("Cooler");
		productList.add("Microwave");
		return  new ResponseEntity(productList, HttpStatus.OK);
		
	}
}
