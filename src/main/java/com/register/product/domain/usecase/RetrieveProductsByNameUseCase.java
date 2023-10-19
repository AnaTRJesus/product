package com.register.product.domain.usecase;

import java.util.List;

import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

public interface RetrieveProductsByNameUseCase {
	
	List<RetrieveProductUseCaseOutputMapper> retrieveProductsByName(String name, String sortField, String sortOrder);
}
