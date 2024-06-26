package C_14_inheritance.abstracts_methods.entities;

import C_14_inheritance.abstracts_methods.entities.enums.Color;

public class Circle extends Shape {

	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override //É obrigatório sobrescrever!
	public double area() {
		return Math.PI * radius * radius;
	}
}
