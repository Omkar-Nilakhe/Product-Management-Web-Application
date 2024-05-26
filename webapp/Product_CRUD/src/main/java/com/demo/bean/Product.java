package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product23jan")
public class Product {
	@Id
	private int prodid;
	@Column(length = 10)
	private String prodname;
	@Column(length = 10)
	private String category;
	private int quantity;
	private double price;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int prodid, String prodname, String category, int quantity, double price) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Product(int prodid, String prodname) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
	}
	
	public Product(int prodid, String category, double price) {
		super();
		this.prodid = prodid;
		this.category = category;
		this.price = price;
	}
	
	public Product(int prodid, int quantity, double price) {
		super();
		this.prodid = prodid;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Product(int prodid, int quantity) {
		super();
		this.prodid = prodid;
		this.quantity = quantity;
	}
	
	public Product(int prodid, double price) {
		super();
		this.prodid = prodid;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", category=" + category + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	

}
