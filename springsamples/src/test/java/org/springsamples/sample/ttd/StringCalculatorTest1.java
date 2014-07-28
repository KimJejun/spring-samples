package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest1 {
	@Test(expected = RuntimeException.class)
    public final void 숫자가_2개이상이면_에러() {
        StringCalculator1.add("1,2,3");
    }
    @Test
    public final void 숫자가_2개면_정상() {
        StringCalculator1.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void 숫자가_아닌값이_있으면_에러() {
        StringCalculator1.add("1,X");
    }
}
