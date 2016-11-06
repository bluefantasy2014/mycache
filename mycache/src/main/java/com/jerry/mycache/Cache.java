package com.jerry.mycache;
/*
 * 定义了cache接口API. 
 * 
 * */
public interface Cache<K,V> {
	public void put(K key,V value); 
	public V get(K key);

	public int  getCacheSize();
}
