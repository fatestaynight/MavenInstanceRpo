package com.itheima.maven;

import junit.framework.Assert;

import org.junit.Test;

/**
 * <p>Title: MavenSecond</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-20 上午11:08:52  
 * @version 1.0
 */
public class TestMavenSecond {
	
	@Test
	public void sayHello(){
		MavenSecond second = new MavenSecond();
		String result = second.sayHello("hm19");
		
		Assert.assertEquals("hello hm19", result);
	}
}
