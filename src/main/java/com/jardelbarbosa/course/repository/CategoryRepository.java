package com.jardelbarbosa.course.repository;

import com.jardelbarbosa.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
