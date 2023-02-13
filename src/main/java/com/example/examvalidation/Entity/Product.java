package com.example.examvalidation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

@Entity
public class Product {
	//something happens in my mind like crazy things 
	//good human beings are coming from india;
	@Id
	@GeneratedValue
	private Integer id;
    @NotBlank
	@Length(min = 5,max = 10)
	private String name; 
	private String colour;
	@NotNull
	@Min(50)
	@Max(100)
	private Double price;
	@Pattern(regexp = "^[A-Z]{5}[1-9]$")
	private String pan;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", pan=" + pan;
	}
	
	

}
