package org.testproj.api.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Operand {
	
	@NotEmpty(message = "x value can't be empty or null")
	private String x;
	
	@NotEmpty(message = "y value can't be empty or null")
	private String y;
	
	public Operand(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getX() {
		return x;
	}
	
	public void setX(String x) {
		this.x = x;
	}
	
	public String getY() {
		return y;
	}
	
	public void setY(String y) {
		this.y = y;
	}
	
}
