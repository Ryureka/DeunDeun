package com.deundeun.app.model;

public class Restaurant {
	long restaurant_id;
	String name;
	String company_name;
	String operation_hour;
	String tel;
	float location_x;
	float location_y;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getOperation_hour() {
		return operation_hour;
	}

	public void setOperation_hour(String operation_hour) {
		this.operation_hour = operation_hour;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public float getLocation_x() {
		return location_x;
	}

	public void setLocation_x(float location_x) {
		this.location_x = location_x;
	}

	public float getLocation_y() {
		return location_y;
	}

	public void setLocation_y(float location_y) {
		this.location_y = location_y;
	}

	@Override
	public String toString() {
		return "Restauarant [restaurant_id=" + restaurant_id + ", name=" + name + ", company_name=" + company_name
				+ ", operation_hour=" + operation_hour + ", tel=" + tel + ", location_x=" + location_x + ", location_y="
				+ location_y + "]";
	}

}
