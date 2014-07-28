package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest4 {
	@Test
    public final void 여러개의_숫자가_들어오면_숫자의_합을_리턴() {
        Assert.assertEquals(3+6+15+18+46+33, StringCalculator4.add("3,6,15,18,46,33"));
    }
}
