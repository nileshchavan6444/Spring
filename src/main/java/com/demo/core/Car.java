package com.demo.core;

public class Car implements Vehicle{
	
	public Car() {
		System.out.println("in car constructor");
	}

	@Override
	public void drive() {
		System.out.println("car is running");
		
	}
}
