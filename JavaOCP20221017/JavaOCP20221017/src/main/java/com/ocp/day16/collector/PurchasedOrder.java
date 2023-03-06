package com.ocp.day16.collector;

import java.util.Objects;
public class PurchasedOrder {
	
	private String productName;
	private Integer quantity;
	private Double price;

	public PurchasedOrder() {
		super();
	}

	public PurchasedOrder(String productName, Integer quantity, Double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productName, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchasedOrder other = (PurchasedOrder) obj;
		return Objects.equals(price, other.price) && Objects.equals(productName, other.productName)
				&& Objects.equals(quantity, other.quantity);
	}

	@Override
	public String toString() {
		return "PurchasedOrder [productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
