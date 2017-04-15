package com.itheima.maven;

import org.junit.Test;

import junit.framework.Assert;

/**
 * <p>Title: TestMavenThird</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-20 下午2:57:51  
 * @version 1.0
 */
public class TestMavenThird {

	@Test
	public void testSayHello(){
		MavenThird third = new MavenThird();
		
		String result = third.sayHello("hm19");
		
		Assert.assertEquals("hello hm19", result);
	}
}
