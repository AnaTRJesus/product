package com.register.product.gateway.repository.impl.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.register.product.gateway.repository.entity.Product;

@Repository
public interface SupplierDetailsGatewayRepositoryImplementationJPA extends PagingAndSortingRepository<Product, String> {

}
