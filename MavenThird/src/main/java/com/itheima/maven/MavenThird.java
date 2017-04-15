package com.itheima.maven;
/**
 * <p>Title: MavenThird</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-20 下午2:54:29  
 * @version 1.0
 */
public class MavenThird {

	public String sayHello(String name){
		
		MavenSecond second = new MavenSecond();
		
		return second.sayHello(name);
	}
}
