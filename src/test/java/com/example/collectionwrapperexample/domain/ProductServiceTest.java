package com.example.collectionwrapperexample.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

	@Autowired ProductService productService;

	@Test
	void test1(){
		final var totalPrice = productService.getTotalPrice();

		System.out.println(totalPrice);
	}

}