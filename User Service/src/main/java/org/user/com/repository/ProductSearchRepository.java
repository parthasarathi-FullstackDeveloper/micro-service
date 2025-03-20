package org.user.com.repository;

import org.user.com.domain.ProductSearchDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductSearchRepository extends MongoRepository<ProductSearchDomain,String> {
}
