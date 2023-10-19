package com.register.product.domain.usecase;

import com.register.product.presentation.mapper.input.RegisterProductUseCaseInputMapper;
import com.register.product.presentation.mapper.output.RegisterProductUseCaseOutputMapper;

public interface RegisterProductUseCase {
	
	RegisterProductUseCaseOutputMapper register(RegisterProductUseCaseInputMapper registerProductUseCaseInputMapper);
}
