package com.register.product.gateway.repository.mapper.input;

import java.math.BigDecimal;
import java.util.UUID;

import com.register.product.gateway.repository.entity.Product;
import com.register.product.gateway.repository.entity.SupplierDetails;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ProductGatewayRepositoryMapperInput {
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private String supplierName;
	
	private UUID supplierIdentifier;

	public static Product mapper(
			ProductGatewayRepositoryMapperInput productGatewayRepositoryMapperInput) {
		
		var supplierDetails = SupplierDetails.builder().build();
		var product = Product.builder().supplierDetails(supplierDetails).build();
		
		return product;
	}
}
