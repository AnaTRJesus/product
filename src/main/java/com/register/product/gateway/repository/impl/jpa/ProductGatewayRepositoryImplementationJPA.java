package com.register.product.gateway.repository.impl.jpa;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.register.product.gateway.repository.entity.Product;

@Repository
public interface ProductGatewayRepositoryImplementationJPA extends CrudRepository<Product, String>, PagingAndSortingRepository<Product, String> {

	List<Product> findByName(String name, Pageable page);
	
	List<Product> findByNameAndSku(String name, String sku);	
	
	List<Product> findByNameOrSku(String name, String sku);	
}
