package com.register.product.gateway.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.gateway.repository.entity.Product;
import com.register.product.gateway.repository.impl.jpa.ProductGatewayRepositoryImplementationJPA;
import com.register.product.gateway.repository.mapper.input.ProductGatewayRepositoryMapperInput;
import com.register.product.gateway.repository.mapper.output.ProductGatewayRepositoryMapperOutput;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ProductGatewayRepositoryImplementation implements ProductGatewayRepository {
	
	private final ProductGatewayRepositoryImplementationJPA productGatewayRepositoryImplementation;

	public ProductGatewayRepositoryMapperOutput save(ProductGatewayRepositoryMapperInput productGatewayRepositoryMapperInput) {
		
		var product = productGatewayRepositoryImplementation.save(ProductGatewayRepositoryMapperInput.mapper(productGatewayRepositoryMapperInput));
		return ProductGatewayRepositoryMapperOutput.mapper(product);
	}

	public ProductGatewayRepositoryMapperOutput findByKey(String key) throws Exception {
		
		var product = productGatewayRepositoryImplementation.findById(key);
		if(!product.isPresent()) {
			throw new Exception();
		}
		return ProductGatewayRepositoryMapperOutput.mapper(product.get());
	}

	public List<ProductGatewayRepositoryMapperOutput> findAllUsingFilter(Sort sort) {
		var products = productGatewayRepositoryImplementation.findAll(sort);
	    List<Product> result = new ArrayList<Product>();
		products.forEach(result::add);

		var productsGatewayRepositoryMapperOutput = result.stream()
		.map(product -> ProductGatewayRepositoryMapperOutput.mapper(product))
		.collect(Collectors.toList());
		
		return productsGatewayRepositoryMapperOutput;
	}
}
