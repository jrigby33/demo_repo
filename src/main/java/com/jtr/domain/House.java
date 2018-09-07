package com.jtr.domain;

public class House {
	
	private int id;
	private String address;
	private String country;
	private String description;
	private int price;
	private int photo;
	
	public House(int id, String address, String country, String description, int price, int photo) {
		this.id = id;
		this.address = address;
		this.country = country;
		this.description = description;
		this.price = price;
		this.photo = photo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPhoto() {
		return photo;
	}
	public void setPhoto(int photo) {
		this.photo = photo;
	}

}
