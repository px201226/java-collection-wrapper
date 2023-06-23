package com.example.collectionwrapperexample.domain;

import java.util.Iterator;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Products implements Iterable<Product> {

	private final Stream<Product> stream;

	@Override public Iterator<Product> iterator() {
		return stream.iterator();
	}

	public Integer getTotalPrice() {
		return stream
				.map(Product::getPrice)
				.reduce(0, Integer::sum);
	}
}
