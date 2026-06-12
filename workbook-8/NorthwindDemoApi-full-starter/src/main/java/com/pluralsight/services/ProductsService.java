package com.pluralsight.services;

import com.pluralsight.models.Category;
import com.pluralsight.models.Product;
import com.pluralsight.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
	ProductsRepository repository;
	@Autowired
	public ProductsService(ProductsRepository repository) {
		this.repository = repository;
	}

	public List<Product> findAllProducts() {
		var products = repository.findAll();
		return products;
	}

	public Product findProductById(int id) {
		var product = repository.findById(id).get();
		return product;
	}

	public Product addProduct(Product product) {
		var newProduct = repository.save(product);
		return newProduct;
	}

	public Product updateProduct(int id, Product product) {
		Product newProduct = repository.findById(id).get();

		newProduct.setProductName(product.getProductName());
		newProduct.setCategoryId(product.getCategoryId());
		return repository.save(newProduct);
	}

	public void deleteProduct(int id) {
		repository.deleteById(id);
	}

}
