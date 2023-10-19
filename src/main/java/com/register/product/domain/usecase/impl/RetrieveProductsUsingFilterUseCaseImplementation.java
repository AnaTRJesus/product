package com.register.product.domain.usecase.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.register.product.domain.usecase.RetrieveProductsUsingFilterUseCase;
import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RetrieveProductsUsingFilterUseCaseImplementation implements RetrieveProductsUsingFilterUseCase {
	
	private final ProductGatewayRepository repository;
	
	public List<RetrieveProductUseCaseOutputMapper> retrieveProductsUsingFilters(String sort_order, String sort_field) {
		
		var products = repository.findAllUsingFilter(Sort.by(Sort.Direction.fromString(sort_order), sort_field));
		
		var retrieveProductUseCaseOutputMapper = products.stream()
				.map(product -> RetrieveProductUseCaseOutputMapper.mapper(product))
				.collect(Collectors.toList());
				
		return retrieveProductUseCaseOutputMapper;
	}
}
