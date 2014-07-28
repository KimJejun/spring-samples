package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest7 {
	@Test(expected = RuntimeException.class)
	public final void 음수가_들어올경우_에러() {
	    StringCalculator7.add("3,-6,15,18,46,33");
	}
	@Test
	public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
	    RuntimeException exception = null;
	    try {
	        StringCalculator7.add("3,-6,15,-18,46,33");
	    } catch (RuntimeException e) {
	        exception = e;
	    }
	    Assert.assertNotNull(exception);
	    Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}
}
