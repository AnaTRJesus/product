package com.register.product.gateway.repository.mapper.output;

import com.register.product.gateway.repository.entity.Product;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ProductGatewayRepositoryMapperOutput {
	
	private String sku;
	
	private String name;
	
	public static ProductGatewayRepositoryMapperOutput mapper(Product product) {
		
		var productGatewayRepositoryMapperOutput = ProductGatewayRepositoryMapperOutput
				.builder()
				.name(product.getName())
				.sku(product.getSku())
				.build();
		
		return productGatewayRepositoryMapperOutput;
	}
}
