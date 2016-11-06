package com.jerry.mycache;

import java.util.LinkedHashMap;
/*
 * 直接使用LinkedashMap构造的LRU cache。
 * Q1： cache的size是创建的时候指定的呢？还是以后可以动态改变呢？ 
 * A1: 
 * */
import java.util.Map;

public class LinkedHashMapCache<K, V> extends LinkedHashMap<K, V>  {
	private static final long serialVersionUID = 1L;
	private int size=0;

	LinkedHashMapCache(int size) {
		super((int) (size / 0.75), (float) 0.75, true);
		this.size = size;
	}

	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > this.size();
	}

	public int getCacheSize() {
		return this.size(); 
	}
}
