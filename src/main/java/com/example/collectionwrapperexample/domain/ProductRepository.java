package com.example.collectionwrapperexample.domain;

public interface ProductRepository {

	Products findByPriceGreaterThan(Integer price);
}
