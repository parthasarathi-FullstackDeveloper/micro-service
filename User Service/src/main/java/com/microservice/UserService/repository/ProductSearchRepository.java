package com.microservice.UserService.repository;

import com.microservice.UserService.domain.ProductSearchDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductSearchRepository extends MongoRepository<ProductSearchDomain,String> {
}
