package demo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import demo.order.data.IOrderDao;
import demo.order.model.Order;

@Service
public class OrderService implements IOrderService {

	@Autowired
	Order order;
	
	@Autowired
	IOrderDao orderDao;
	@Override
	@GetMapping
	public Order Discount() {
		order = orderDao.getOrder();
		
		if(order.getAmount()>5000)
			order.setDiscount(order.getAmount()*0.1f);
		return order;
	}

}
