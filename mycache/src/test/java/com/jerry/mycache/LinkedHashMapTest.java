package com.jerry.mycache;

import java.util.LinkedHashMap;

import org.apache.log4j.Logger;

/*只是用来测试jdk中的类LinkedHashMap来了解一下这个类的特性。 
 * */

import org.junit.Test;

import junit.framework.Assert;

public class LinkedHashMapTest {
    private static final Logger LOG = Logger.getLogger(LinkedHashMapTest.class);

	/*测试目的： 假定创建是的capacity是100.
	 * HashMap的capacity是无法获取到的，它属于内部的实现。没有开放api。 
	 * */
	@Test
	public void testCapacity(){
		int capacity = 100; 
		LinkedHashMap<String,Object> map = new LinkedHashMap<String,Object>(10,1);
		for (int i=0; i<capacity; ++i){
			map.put("k"+i, new Object());
		}
		LOG.debug("map's size :" + map.size());
		Assert.assertEquals(map.size(), capacity);
	}
}
