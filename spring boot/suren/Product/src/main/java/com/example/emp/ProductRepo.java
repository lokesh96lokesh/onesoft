package com.example.emp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

}
