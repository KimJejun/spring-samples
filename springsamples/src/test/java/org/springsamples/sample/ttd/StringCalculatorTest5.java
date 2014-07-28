package org.springsamples.sample.ttd;

import junit.framework.Assert;

import org.junit.Test;

public class StringCalculatorTest5 {
	public final void 줄바꿈_문자도_구분자로_포함() {
	    Assert.assertEquals(3+6+15, StringCalculator5.add("3,6n15"));
	}
}
