package com.register.product.gateway.repository.entity;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "product")
public class Product {
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	@OneToOne(cascade=CascadeType.ALL)
	private SupplierDetails supplierDetails;
	
	@Override
	public String toString() {
		return "Product: " + name + ", Description: ";
	}
}
