package com.register.product.presentation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.product.domain.usecase.RegisterProductUseCase;
import com.register.product.domain.usecase.RetrieveProductsUsingFilterUseCase;
import com.register.product.domain.usecase.RetrieveSingleProductUseCase;
import com.register.product.presentation.mapper.input.RegisterProductUseCaseInputMapper;
import com.register.product.presentation.mapper.output.RegisterProductUseCaseOutputMapper;
import com.register.product.presentation.mapper.output.RetrieveProductUseCaseOutputMapper;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/product")

public class ProductControllerVersion01 {
	
	private final RegisterProductUseCase registerProduct;
	private final RetrieveSingleProductUseCase retrieveProduct;
	private final RetrieveProductsUsingFilterUseCase retrieveProductsUsingFilter;
	
	
	@PostMapping()
	public ResponseEntity<RegisterProductUseCaseOutputMapper> register(@RequestBody RegisterProductUseCaseInputMapper payload){
		
		var product = registerProduct.register(payload);
		return new ResponseEntity<RegisterProductUseCaseOutputMapper>(product, HttpStatus.CREATED);
	}
	
	@GetMapping("/{key}")
	public ResponseEntity<RetrieveProductUseCaseOutputMapper> retievebyKey(@PathVariable String key) throws Exception{
		
		var product = retrieveProduct.retrieve(key);
		return new ResponseEntity<RetrieveProductUseCaseOutputMapper>(product, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<RetrieveProductUseCaseOutputMapper>> retieveAllProductsUsingFilters(){
		
		var products = retrieveProductsUsingFilter.retrieveProductsUsingFilters();
		return new ResponseEntity<List<RetrieveProductUseCaseOutputMapper>>(products, HttpStatus.OK);
	}
}
