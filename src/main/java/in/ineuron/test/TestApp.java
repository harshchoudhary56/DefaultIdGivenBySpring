package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.in.read();
		
		// This is the default id given by spring
		Student student = factory.getBean("in.ineuron.comp.Student#0", Student.class);
		System.out.println(student);
		
		factory.close();
	}
}
