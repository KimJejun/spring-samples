package org.springsamples.sample.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-context.xml");
        WithAnnotation bean = ctx.getBean(WithAnnotation.class);
        bean.someMethod();
	}
}
