package demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.order.model.Order;
import demo.order.service.IOrderService;

@RestController
public class DiscountedController {
	@Autowired
	Order order;
	@Autowired
	IOrderService orderService;
	@GetMapping
	public String discounted() {
		order=orderService.Discount();
		return order.toString();
	}
	
}
