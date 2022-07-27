package com.springdevbootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
	 int pno;
	@Column(name="pname")
	 String pname;
	@Column(name="price")
	 double price;
	
	
	public Product() {
			
	}
	
	public Product(int pno, String pname, double price) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
