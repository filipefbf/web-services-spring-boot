package com.filipeltda.course.repositories;

import com.filipeltda.course.entities.OrderItem;
import com.filipeltda.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
