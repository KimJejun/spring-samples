package org.springsamples.sample.transaction;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface WithAnnotation {
	void someMethod();
}
