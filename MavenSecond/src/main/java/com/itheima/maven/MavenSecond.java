package com.itheima.maven;
/**
 * <p>Title: MavenSecond</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-20 上午11:08:52  
 * @version 1.0
 */
public class MavenSecond {
	
	public String sayHello(String name){
		MavenFirst first = new MavenFirst();
		return first.sayHello(name);
	}
}
