package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;

@SuppressWarnings("deprecation")
public class ScopePrototype {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("scope_prototype.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		System.out.println("xml file valid");
		Test t1 = (Test) bf.getBean("t");
		Test t2 = (Test) bf.getBean("t");
		// by default scope is singleton
		System.out.println("both object reference are same:"+(t1 == t2));
		t1.hello();
		t2.hello();

	}

}
