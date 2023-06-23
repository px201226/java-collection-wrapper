package com.example.collectionwrapperexample.springboot;

import com.example.collectionwrapperexample.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {

	ProductsSCO findByPriceGreaterThan(Integer price);
}
