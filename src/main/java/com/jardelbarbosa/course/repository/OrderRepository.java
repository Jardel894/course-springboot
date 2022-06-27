package com.jardelbarbosa.course.repository;

import com.jardelbarbosa.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
