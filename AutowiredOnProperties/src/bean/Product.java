package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {

	private Integer price;
	private String name;
	@Autowired
	private Type type;

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}
}
