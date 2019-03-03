package com.store.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.store.domain.Product;

	public interface ProductRepository extends CrudRepository<Product, Integer> {
		@Query(value = "SELECT name FROM Products WHERE id = ?", nativeQuery = true)
		String findNameById(int id);//получить наименование товара по его id
		@Query(value = "SELECT price FROM Products WHERE id = ?", nativeQuery = true)
		int findPriceById(int id);//получить цену товара по его id
	}
