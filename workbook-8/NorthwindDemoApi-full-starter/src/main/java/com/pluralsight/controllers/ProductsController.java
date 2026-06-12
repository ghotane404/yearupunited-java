package com.pluralsight.controllers;

import com.pluralsight.models.Product;
import com.pluralsight.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController         // tells spring that the class is REST API and will return data as JSON (not HTML)
@RequestMapping("/products")        // base URL for enpoint controller
@CrossOrigin        // communication between front and backend??
public class ProductsController {
	private ProductsService productsService;

	@Autowired      // construction injection
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
	}

	// --------------------------- GET REQUEST ---------------------------

	// returns list of all productS/
	@GetMapping
	public ResponseEntity<List<Product>> getAll() {
		var products = productsService.findAllProducts();
		return ResponseEntity.ok(products);     // returns HTTP 200 OK console
	}

	// returns list of all product from  /products/{id}
	@GetMapping("/{id}")
	public ResponseEntity<Product> getById(@PathVariable int id) {
		var product = productsService.findProductById(id);      // will find one id from /products/{id}
		return ResponseEntity.ok(product);       // returns HTTP 200 OK console when successful
	}

	// --------------------------- POST REQUEST ---------------------------

	// used to add newProduct in /products
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)      //returns HTTP 201 CREATED when successful
	// @RequestBody takes the JSON from insoomnia and converts to Product object
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		var newProduct = productsService.addProduct(product);       // calling ProductsService method to save the product
		URI location = URI.create("/products/" + newProduct.getProductId());    // creates the URI in the products/{id}
		// Returns HTTP 201 CREATED and includes the newProduct in the response body
		return ResponseEntity.created(location).body(newProduct);
	}

	// --------------------------- PUT REQUEST ---------------------------

	// used to handle existing products in /products/{id}
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)      // returns HTTP 204 NO_CONTENT if successful

	// [@PathVariable] = gets the id from /{id} URL
	// [@RequestBody] = gets the updated product data from the JSON body
	public ResponseEntity<Void> update(@PathVariable int id, @RequestBody Product product) {
		productsService.updateProduct(id, product);     // calling ProductsService method to update the product
		return ResponseEntity.noContent().build();      // returns HTTP 204 NO_CONTENT when successful
	}

	// --------------------------- DELETE REQUEST ---------------------------

	// used to delete existing products in /products/{id}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)      // returns HTTP 204 NO_CONTENT if successful
	public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
		productsService.deleteProduct(id);      // calls ProductsService method to update the product
		return ResponseEntity.noContent().build();      // returns HTTP 204 NO_CONTENT when successful
	}

}
