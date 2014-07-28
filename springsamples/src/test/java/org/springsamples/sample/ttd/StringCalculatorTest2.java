package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest2 {
	@Test
	public final void 빈_문자열이_들어오면_0리턴() {
	    Assert.assertEquals(0, StringCalculator2.add(""));
	}
}
