package demo.order.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import demo.order.model.Order;

@Repository
public class OrderDao implements IOrderDao {
	@Autowired
	Order order;
	
	@Override
	@GetMapping
	public Order getOrder() {
		order.setOrderId(1);
		order.setAmount(10000);
		order.setDiscount(0);
		return order;
	}
}
