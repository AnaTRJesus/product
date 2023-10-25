package com.register.product.domain.usecase.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RetrieveProductsByNameAndSku;
import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class RetrieveProductsByNameAndSkuImplementation implements RetrieveProductsByNameAndSku {
	
	private final ProductGatewayRepository repository;


	public List<RetrieveProductUseCaseOutputMapper> retrieveProductsByNameAndSku(String name, String sku) {
		
		var products = repository.findByNameAndSku(name, sku);
		
		var retrieveProductUseCaseOutputMapper = products.stream()
				.map(product -> RetrieveProductUseCaseOutputMapper.mapper(product))
				.collect(Collectors.toList());
				
		return retrieveProductUseCaseOutputMapper;
	}
}
