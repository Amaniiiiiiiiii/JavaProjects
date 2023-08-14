package demo.order.model;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private float amount;
	private float discount;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, float amount, float discount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.discount = discount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", discount=" + discount + "]";
	}
	
	
}
