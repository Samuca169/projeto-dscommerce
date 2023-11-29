package com.samucabarr.dscommerce.services;

import com.samucabarr.dscommerce.dto.OrderDTO;
import com.samucabarr.dscommerce.dto.ProductDTO;
import com.samucabarr.dscommerce.entities.Order;
import com.samucabarr.dscommerce.entities.Product;
import com.samucabarr.dscommerce.repositories.OrderRepository;
import com.samucabarr.dscommerce.repositories.ProductRepository;
import com.samucabarr.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
