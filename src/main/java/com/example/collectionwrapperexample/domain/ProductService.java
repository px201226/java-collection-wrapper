package com.example.collectionwrapperexample.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;

	public Integer getTotalPrice(){
		final var products = productRepository.findByPriceGreaterThan(0);

		return products.getTotalPrice();
	}
}
