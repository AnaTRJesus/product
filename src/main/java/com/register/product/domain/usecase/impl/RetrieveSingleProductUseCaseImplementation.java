package com.register.product.domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RetrieveSingleProductUseCase;
import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RetrieveSingleProductUseCaseImplementation implements RetrieveSingleProductUseCase {
	
	private final ProductGatewayRepository repository;
	
	public RetrieveProductUseCaseOutputMapper retrieve(String key) throws Exception {
		var retrieveProductUseCaseOutputMapper = RetrieveProductUseCaseOutputMapper.mapper(repository.findByKey(key));
		return retrieveProductUseCaseOutputMapper;
	}
}
