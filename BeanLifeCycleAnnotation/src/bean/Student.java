package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + name);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Student clean up");
	}
}
