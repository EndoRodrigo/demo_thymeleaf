package com.endorodrigo.springboot.backend.repositories;

import com.endorodrigo.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
