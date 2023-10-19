package com.register.product.gateway.repository;

import org.springframework.data.domain.Sort;

import com.register.product.gateway.repository.mapper.input.ProductGatewayRepositoryMapperInput;
import com.register.product.gateway.repository.mapper.output.ProductGatewayRepositoryMapperOutput;

public interface ProductGatewayRepository {
	
	ProductGatewayRepositoryMapperOutput save(ProductGatewayRepositoryMapperInput product);
	
	ProductGatewayRepositoryMapperOutput findByKey(String key) throws Exception;
	
	Iterable<ProductGatewayRepositoryMapperOutput> findAllUsingFilter(Sort sort);
}
