package com.jardelbarbosa.course.repository;

import com.jardelbarbosa.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
