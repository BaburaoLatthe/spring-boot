package com.amit.app.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
*
* @author Amit Patil
*
**/
public class MyPair {

	private String first;

	private String second;

	public MyPair() {
		super();
	}

	public MyPair(String first, String second) {
		super();
		this.first = first;
		this.second = second;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	@Override
	@JsonValue
	public String toString() {
		return this.first + " and " + this.second;
	}
	
}
