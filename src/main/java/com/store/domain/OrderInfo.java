package com.store.domain;
//класс для создания объекта "Информация о заказе" (для передачи информации во view (mustache))
public class OrderInfo {
	/*
	public String name;
	public int amount;
	public int price;
	public int sum;
	*/
	private String name;
	private int amount;
	private int price;
	private int sum;
	
	public OrderInfo(String name, int amount, int price, int sum) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.sum = sum;
	}
	
	//геттеры и сеттеры
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
}
