package com.amit.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 5)
	@NotNull(message = "id of the address can't be null!")
	private String id;
	
	@NotNull(message = "street address can't be null!")
	@NotEmpty(message = "street address can't be empty!")
	private String street;
	
	@NotNull(message = "address line1 can't be null!")
	@NotEmpty(message = "address line1 can't be empty!")	
	private String addressLine1;
	
	@Nullable
	private String addressLine2;
	
	public Address(String id, String street, String addressLine1) {
		super();
		this.id = id;
		this.street = street;
		this.addressLine1 = addressLine1;
	}

	public Address(String id, String street, String addressLine1, String addressLine2) {
		super();
		this.id = id;
		this.street = street;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + "]";
	}
	
}
