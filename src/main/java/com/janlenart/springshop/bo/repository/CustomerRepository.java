package com.janlenart.springshop.bo.repository;

import com.janlenart.springshop.bo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
