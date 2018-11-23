package com.wish.admin.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wish.admin.products.services.ProductService;

/**
 * 
 * @author vikash kumar
 * Controller related to product modules
 */
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	/*@Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }*/
	/**
	 * 
	 * @return ResponseEntity
	 * Dummy method to fetch the List of products
	 */
	@GetMapping(value="/products")
	public ResponseEntity getProducts(){
		List productList = new ArrayList<>();
		productList.add("TV");
		productList.add("Fridge");
		productList.add("Radio");
		productList.add("Cooler");
		productList.add("Microwave");
		return  new ResponseEntity(productList, HttpStatus.OK);
		
	}
	/**
	 * Listing all the products available
	 * @return
	 */
	@GetMapping(value="/allproducts")
	public ResponseEntity getAllProducts() {
		return new ResponseEntity<>(productService.listAll(),HttpStatus.OK);
	}
}
