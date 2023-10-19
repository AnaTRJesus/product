package com.register.product.presentation.mapper.output;


import com.register.product.gateway.repository.mapper.output.ProductGatewayRepositoryMapperOutput;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class RegisterProductUseCaseOutputMapper {
	
	private String sku;
	
	private String name;

	public static RegisterProductUseCaseOutputMapper mapper(ProductGatewayRepositoryMapperOutput savedProductEntity) {
		var registerProductUseCaseOutputMapper = RegisterProductUseCaseOutputMapper.builder()
				.name(savedProductEntity.getName())
				.sku(savedProductEntity.getSku())
				.build();
		return registerProductUseCaseOutputMapper;
	}

}
