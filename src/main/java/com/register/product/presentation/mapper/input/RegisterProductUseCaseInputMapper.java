package com.register.product.presentation.mapper.input;

import java.math.BigDecimal;
import java.util.UUID;

import com.register.product.gateway.repository.mapper.input.ProductGatewayRepositoryMapperInput;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class RegisterProductUseCaseInputMapper {
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private String supplierName;
	
	private UUID supplierIdentifier;


	public static ProductGatewayRepositoryMapperInput mapper(
			RegisterProductUseCaseInputMapper registerProductUseCaseInputMapper) {

		var productGatewayRepositoryMapperInput = ProductGatewayRepositoryMapperInput.builder()
		.name(registerProductUseCaseInputMapper.getName())
		.description(registerProductUseCaseInputMapper.getDescription())
		.price(registerProductUseCaseInputMapper.getPrice())
		.sku(registerProductUseCaseInputMapper.getSku())
		.supplierName(registerProductUseCaseInputMapper.getSupplierName())
		.supplierIdentifier(registerProductUseCaseInputMapper.getSupplierIdentifier())
		.build();
		
		
		return productGatewayRepositoryMapperInput;
	}
}
