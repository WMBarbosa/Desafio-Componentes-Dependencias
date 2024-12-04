package com.devsuperior.desafio;

import com.devsuperior.desafio.Entities.Order;
import com.devsuperior.desafio.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.0, 20.0);
		System.out.printf("Pedido Codigo: %d%nValor Total: %.2f%n", order.getCode(), orderService.total(order) );
		System.out.println();

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.printf("Pedido Codigo: %d%nValor Total: %.2f%n", order2.getCode(), orderService.total(order2) );
		System.out.println();

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido Codigo: %d%nValor Total: %.2f%n", order3.getCode(), orderService.total(order3) );

	}
}
