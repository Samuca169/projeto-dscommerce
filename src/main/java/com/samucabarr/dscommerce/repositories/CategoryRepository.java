package com.samucabarr.dscommerce.repositories;

import com.samucabarr.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
