package net.sean;

import net.sean.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sean
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-sean.xml");
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println("--->"+person);
	}
}
