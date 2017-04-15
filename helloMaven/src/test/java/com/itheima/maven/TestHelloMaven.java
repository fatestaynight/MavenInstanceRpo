package com.itheima.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class TestHelloMaven{
	
	@Test
	public void testSayHello(){
		HelloMaven hm = new HelloMaven();
		
		String result = hm.sayHello("hm19");
		
		assertEquals("hello hm19",result);
	}
}  	