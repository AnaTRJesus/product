package com.register.product.gateway.repository;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.register.product.gateway.repository.mapper.input.ProductGatewayRepositoryMapperInput;
import com.register.product.gateway.repository.mapper.output.ProductGatewayRepositoryMapperOutput;

public interface ProductGatewayRepository {
	
	ProductGatewayRepositoryMapperOutput save(ProductGatewayRepositoryMapperInput product);
	
	ProductGatewayRepositoryMapperOutput findByKey(String key) throws Exception;
	
	List<ProductGatewayRepositoryMapperOutput> findAllUsingFilter(Sort sort);
	
	List<ProductGatewayRepositoryMapperOutput> findByName(String name, String sortField, String sortOrder);
}
