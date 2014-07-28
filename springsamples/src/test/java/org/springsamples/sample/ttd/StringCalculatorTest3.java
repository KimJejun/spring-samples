package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest3 {
	@Test
	public final void 숫자가_하나면_그자체를_리턴() {
	    Assert.assertEquals(3, StringCalculator3.add("3"));
	}
	 
	@Test
	public final void 숫자가_두개면_숫자의_합을_리턴() {
	    Assert.assertEquals(3+6, StringCalculator3.add("3,6"));
	}
}
