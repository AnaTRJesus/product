package com.register.product.domain.usecase.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RetrieveProductsByNameUseCase;
import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RetrieveProductsByNameUseCaseImplementation implements RetrieveProductsByNameUseCase{
	
	private final ProductGatewayRepository repository;

	@Override
	public List<RetrieveProductUseCaseOutputMapper> retrieveProductsByName(String name, String sortField, String sortOrder){

			var products = repository.findByName(name, sortField, sortOrder);
	
			var retrieveProductUseCaseOutputMapper = products.stream()
					.map(product -> RetrieveProductUseCaseOutputMapper.mapper(product))
					.collect(Collectors.toList());
					
			return retrieveProductUseCaseOutputMapper;
	}
}
