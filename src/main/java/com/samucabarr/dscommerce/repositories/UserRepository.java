package com.samucabarr.dscommerce.repositories;

import com.samucabarr.dscommerce.entities.Product;
import com.samucabarr.dscommerce.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
