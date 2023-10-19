package com.register.product.gateway.repository.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "supplier_details")
public class SupplierDetails {

	private UUID supplierIdentifier;
	
	private String name;
}
