package com.register.product.domain.entity;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class SupplierDetails {
	
	private UUID supplierIdentifier;
	
	private String name;
}
