package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Product;
import bean.Type;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeansAutowireAnnotation.xml");

		Product product = (Product) context.getBean("product");

		System.out.println("Product Name : " + product.getName());
		System.out.println("Price : " + product.getPrice());

		Type productType = product.getType();

		System.out.println(product.getName() + " is of type:"
				+ productType.getType());
	}

}
