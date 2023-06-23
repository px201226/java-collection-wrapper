package com.example.collectionwrapperexample.springboot;

import com.example.collectionwrapperexample.domain.Product;
import com.example.collectionwrapperexample.domain.Products;
import java.util.Iterator;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;

@RequiredArgsConstructor
public class ProductsSCO implements Streamable<Product> {

	private final Streamable<Product> streamable;

	@Override public Iterator<Product> iterator() {
		return streamable.iterator();
	}

	public Products toProducts(){
		return new Products(streamable.stream());
	}

}
