package com.register.product.domain.usecase.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.register.product.domain.usecase.RetrieveProductsUsingFilterUseCase;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RetrieveProductsUsingFilterUseCaseImplementation implements RetrieveProductsUsingFilterUseCase {@Override
	public List<RetrieveProductUseCaseOutputMapper> retrieveProductsUsingFilters() {
		// TODO Auto-generated method stub
		return null;
	}

}
