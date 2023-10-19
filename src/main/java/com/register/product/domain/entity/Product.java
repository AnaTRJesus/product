package com.register.product.domain.entity;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Product {
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private SupplierDetails supplierDetails;
	
	
	@Override
	public String toString() {
		return "Product: " + name + ", Description: ";
	}
}
