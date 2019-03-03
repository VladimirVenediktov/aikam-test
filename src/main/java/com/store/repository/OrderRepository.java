package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.store.domain.Order;

	public interface OrderRepository extends CrudRepository<Order, Integer> {
		List<Order> findByNumber(int number);//выбрать все записи таблицы "Заказы" по номеру заказа
		@Query(value = "SELECT DISTINCT NUMBER FROM Orders", nativeQuery = true)
			List<Integer> findAllDistinctNumber();//получить список уникальных номеров заказов
	}
