package com.register.product.domain.usecase;

import java.util.List;

import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

public interface RetrieveProductsUsingFilterUseCase {
	
	List<RetrieveProductUseCaseOutputMapper> retrieveProductsUsingFilters(String sort_order, String sort_field);
}
