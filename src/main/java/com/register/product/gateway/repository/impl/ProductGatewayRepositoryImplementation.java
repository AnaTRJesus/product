package com.register.product.gateway.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.gateway.repository.entity.Product;
import com.register.product.gateway.repository.impl.jpa.ProductGatewayRepositoryImplementationJPA;
import com.register.product.gateway.repository.mapper.input.ProductGatewayRepositoryMapperInput;
import com.register.product.gateway.repository.mapper.output.ProductGatewayRepositoryMapperOutput;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProductGatewayRepositoryImplementation implements ProductGatewayRepository {
	
	private final ProductGatewayRepositoryImplementationJPA productGatewayRepositoryImplementationJPA;

	public ProductGatewayRepositoryMapperOutput save(ProductGatewayRepositoryMapperInput productGatewayRepositoryMapperInput) {
		var product = productGatewayRepositoryImplementationJPA.save(ProductGatewayRepositoryMapperInput.mapper(productGatewayRepositoryMapperInput));
		
		return ProductGatewayRepositoryMapperOutput.mapper(product);
	}

	public ProductGatewayRepositoryMapperOutput findByKey(String key) throws Exception {
		var product = productGatewayRepositoryImplementationJPA.findById(key);
		if(!product.isPresent()) {
			throw new Exception();
		}
		
		return ProductGatewayRepositoryMapperOutput.mapper(product.get());
	}

	public List<ProductGatewayRepositoryMapperOutput> findAllUsingFilter(Sort sort) {
		var products = productGatewayRepositoryImplementationJPA.findAll(sort);
	    List<Product> result = new ArrayList<Product>();
		products.forEach(result::add);

		var productsGatewayRepositoryMapperOutput = result.stream()
		.map(product -> ProductGatewayRepositoryMapperOutput.mapper(product))
		.collect(Collectors.toList());
		
		return productsGatewayRepositoryMapperOutput;
	}

	@Override
	public List<ProductGatewayRepositoryMapperOutput> findByName(String name, String sortField, String sortOrder) {
		Pageable page = PageRequest.of(0,10,Sort.by(Direction.fromString(sortOrder), sortField));
		var products = productGatewayRepositoryImplementationJPA.findByName(name, page);
		
		var productsGatewayRepositoryMapperOutput = products.stream()
		.map(product -> ProductGatewayRepositoryMapperOutput.mapper(product))
		.collect(Collectors.toList());
		
		return productsGatewayRepositoryMapperOutput;	
	}
	
	@Override
	public List<ProductGatewayRepositoryMapperOutput> findByNameAndSku(String name, String sku) {	
		var products = productGatewayRepositoryImplementationJPA.findByNameOrSku(name, sku);

		var productsGatewayRepositoryMapperOutput = products.stream()
		.map(product -> ProductGatewayRepositoryMapperOutput.mapper(product))
		.collect(Collectors.toList());
		
		return productsGatewayRepositoryMapperOutput;	
	}
}
