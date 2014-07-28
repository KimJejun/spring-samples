package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest6 {
	@Test
	public final void 여러종류의_구분자를_지원() {
	    Assert.assertEquals(3+6+15, StringCalculator6.add("//;n3;6;15"));
	}
}
