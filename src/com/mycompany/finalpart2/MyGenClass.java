/**
 * 
 */
package com.mycompany.finalpart2;

/**
 * @author Paul Jerchaflie
 * @param <K>
 * @param <V>
 *
 */
public class MyGenClass<K, V> implements MyGenInterface<K, V> {
	
	/**
	 * 
	 */
	public K key;
	public V value;
	
	public MyGenClass(K key,V value) {
		this.key=key;
		this.value=value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}
