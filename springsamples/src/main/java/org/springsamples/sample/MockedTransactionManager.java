package org.springsamples.sample;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionStatus;

@Component("transactionManager")
public class MockedTransactionManager implements PlatformTransactionManager {

	@Override
	public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
		return new DefaultTransactionStatus(this, false, false, false, false, null);
	}

	@Override
	public void commit(TransactionStatus status) throws TransactionException {

	}

	@Override
	public void rollback(TransactionStatus status) throws TransactionException {

	}

}
