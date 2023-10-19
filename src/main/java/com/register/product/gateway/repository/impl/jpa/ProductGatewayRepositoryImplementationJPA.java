package com.register.product.gateway.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.register.product.gateway.repository.entity.Product;

@Repository
public interface ProductGatewayRepositoryImplementationJPA extends CrudRepository<Product, String>, PagingAndSortingRepository<Product, String> {

	@Query(value = "SELECT * from product where name = :name ORDER BY :orderField :orderType", nativeQuery = true)
	public List<Product> test(@Param("name") String name, @Param("orderField") String orderField, @Param("orderType") String orderType);

}
