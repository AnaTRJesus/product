package com.register.product.domain.usecase;

import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

public interface RetrieveSingleProductUseCase {
	
	RetrieveProductUseCaseOutputMapper retrieve(String key);
}
