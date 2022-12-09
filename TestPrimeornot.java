package com.demo.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;




public class TestPrimeornot {
@Test
public void Prime() {
	assertEquals(true,PrimeorNot.prime(29));
	assertEquals(true,PrimeorNot.prime(67));

}
}
