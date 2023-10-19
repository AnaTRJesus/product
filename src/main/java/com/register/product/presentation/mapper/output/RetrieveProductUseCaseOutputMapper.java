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
public class RetrieveProductUseCaseOutputMapper {
	
	private String sku;
	
	private String name;

	public static RetrieveProductUseCaseOutputMapper mapper(
			ProductGatewayRepositoryMapperOutput retievedaproductEntity) {
		
		var retrieveProductUseCaseOutputMapper = RetrieveProductUseCaseOutputMapper
				.builder()
				.name(retievedaproductEntity.getName())
				.sku(retievedaproductEntity.getSku())
				.build();
		
		return retrieveProductUseCaseOutputMapper;
	}
}
