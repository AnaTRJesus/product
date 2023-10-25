package com.register.product.domain.usecase;

import java.util.List;

import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

public interface RetrieveProductsByNameAndSku {
	
	List<RetrieveProductUseCaseOutputMapper> retrieveProductsByNameAndSku(String name, String sku);
}
