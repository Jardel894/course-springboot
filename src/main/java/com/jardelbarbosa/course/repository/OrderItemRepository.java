package com.jardelbarbosa.course.repository;

import com.jardelbarbosa.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
