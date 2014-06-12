package org.springsamples.sample.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionInterceptor;

@Component
public class ConcreteClass implements WithAnnotation {

	@Override
	public void someMethod() {
		System.err.println("In some method: " + TransactionInterceptor.currentTransactionStatus());
	}

}
