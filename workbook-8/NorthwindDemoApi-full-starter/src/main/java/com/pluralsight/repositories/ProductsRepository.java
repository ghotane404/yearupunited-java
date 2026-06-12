package com.pluralsight.repositories;

import com.pluralsight.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
	// Spring automatically gives this repository methods like:
		// findAll() = gets all products
		// findById(id) = gets one product by product ID
		// save(product) = inserts or updates a product
		// deleteById(id) = deletes a product by product ID
}
