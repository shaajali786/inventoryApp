package com.example.inventoryApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.inventoryApp.entities.Products;

@Repository
public interface ProductsJPADAO extends CrudRepository<Products, Integer> {

}
