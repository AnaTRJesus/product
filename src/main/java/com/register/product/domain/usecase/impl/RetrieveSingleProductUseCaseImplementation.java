package com.register.product.domain.usecase.impl;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RetrieveSingleProductUseCase;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RetrieveSingleProductUseCaseImplementation implements RetrieveSingleProductUseCase {@Override
	public RetrieveProductUseCaseOutputMapper retrieve(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
