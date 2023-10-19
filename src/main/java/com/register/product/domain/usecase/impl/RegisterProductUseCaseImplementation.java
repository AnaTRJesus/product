package com.register.product.domain.usecase.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RegisterProductUseCase;
import com.register.product.gateway.repository.ProductGatewayRepository;
import com.register.product.presentation.mapper.input.RegisterProductUseCaseInputMapper;
import com.register.product.presentation.mapper.output.RegisterProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegisterProductUseCaseImplementation implements RegisterProductUseCase {

	private final ProductGatewayRepository repository;
	
	public RegisterProductUseCaseOutputMapper register(RegisterProductUseCaseInputMapper registerProductUseCaseInputMapper) {
		
		registerProductUseCaseInputMapper.setSupplierIdentifier(UUID.randomUUID());
		var savedProductEntity = repository.save(RegisterProductUseCaseInputMapper.mapper(registerProductUseCaseInputMapper));
		return RegisterProductUseCaseOutputMapper.mapper(savedProductEntity);
	}
}
