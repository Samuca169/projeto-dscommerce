package com.samucabarr.dscommerce.repositories;

import com.samucabarr.dscommerce.entities.OrderItem;
import com.samucabarr.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
