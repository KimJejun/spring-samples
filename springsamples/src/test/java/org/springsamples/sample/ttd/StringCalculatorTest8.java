package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest8 {
	@Test
	public final void 파라미터의값이_1000이상의_값이들어오면_무시() {
	    Assert.assertEquals(3+1000+6, StringCalculator8.add("3,1000,1001,6,1234"));
	}
}
