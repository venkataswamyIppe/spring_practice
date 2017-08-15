package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {

	private Integer price;
	private String name;
	private Type type;

	@Autowired
	public Product(Type type) {
		this.type = type;
		System.out.println("Inside Product constructor.");
	}

	// setter
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
