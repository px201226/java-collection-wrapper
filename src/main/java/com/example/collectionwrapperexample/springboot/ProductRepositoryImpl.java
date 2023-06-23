package com.example.collectionwrapperexample.springboot;

import com.example.collectionwrapperexample.domain.ProductRepository;
import com.example.collectionwrapperexample.domain.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private final ProductJpaRepository productJpaRepository;

	@Override public Products findByPriceGreaterThan(final Integer price) {
		final var productsSCO = productJpaRepository.findByPriceGreaterThan(price);
		return productsSCO.toProducts();
	}
}
