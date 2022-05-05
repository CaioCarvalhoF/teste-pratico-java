package com.example.myapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cars")
public class cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "daily_rate")
	private float daily_rate;
	
	@Column(name = "avaliable")
	private boolean avaliable;
	
	@Column(name = "license_plate")
	private int license_plate;
	
	@Column(name = "brand_id")
	private long brand_id;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "created_at")
	private String created_at;
	
	
	public car() {
		super();
	}
	

	public car(String name, String description, float daily_rate, boolean avaliable, int license_plate, String color,
			String created_at) {
		super();
		this.name = name;
		this.description = description;
		this.daily_rate = daily_rate;
		this.avaliable = avaliable;
		this.license_plate = license_plate;
		this.color = color;
		this.created_at = created_at;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getDaily_rate() {
		return daily_rate;
	}
	public void setDaily_rate(float daily_rate) {
		this.daily_rate = daily_rate;
	}
	public boolean isAvaliable() {
		return avaliable;
	}
	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}
	public int getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(int license_plate) {
		this.license_plate = license_plate;
	}
	public long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
}
