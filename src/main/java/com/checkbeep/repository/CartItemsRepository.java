package com.checkbeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.checkbeep.model.CartItems;


@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Long> {

}

