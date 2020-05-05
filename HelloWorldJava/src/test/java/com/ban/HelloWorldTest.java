package com.ban;
import org.junit.Assert;
import org.junit.Test;

import com.ban.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testHello() {
		HelloWorld hhl=new HelloWorld();
		Assert.assertEquals("Indrashis::::::::::::", hhl.hel());
	}
}
