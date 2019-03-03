package com.store.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.domain.Order;
import com.store.domain.OrderInfo;
import com.store.repository.OrderRepository;
import com.store.repository.ProductRepository;


@Controller
public class MainController {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/index")
    public String getOrdersList (Map <String, Object> model) {

		Iterable<Integer> orders = orderRepository.findAllDistinctNumber();
        model.put("ordersList", orders);
        return "orders";
    }
	
	@PostMapping("/order")
	public String getOrderInfo (@RequestParam String number, Map<String, Object> model) {
     
		List<Order> order = orderRepository.findByNumber(Integer.parseInt(number));//получить список заказов из БД с выбранным номером
		ArrayList<OrderInfo> orderInfo = new ArrayList<OrderInfo>();
		int resultSum = 0;//итого по заказу
		
		for (int i=0; i<order.size(); i++) {
			int prodId = order.get(i).getProductId();
			String nameProduct = productRepository.findNameById(prodId);
			int amount = order.get(i).getAmount();
			int price = productRepository.findPriceById(prodId);
			OrderInfo oi = new OrderInfo(nameProduct, amount, price, price*amount);//объект "Информация о заказе"
			orderInfo.add(oi);
			resultSum+=price*amount;
        }
		model.put("orderNumber", number);//номер заказа
		model.put("orderInfo", orderInfo);//коллекция объектов "Информация о заказе"
		model.put("resultSum", resultSum);//итоговая сумма
		
        return "order";
    }
    
}
