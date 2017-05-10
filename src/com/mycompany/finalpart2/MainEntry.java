/**
 * 
 */
package com.mycompany.finalpart2;

/**
 * @author Paul Jerchaflie
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer, Integer> mgi2;
		mgi1=new MyGenClass<Integer, String>(1, "Paul");
		mgi2=new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1=MyRegularClass.getSum(10,20);
		Float f1=MyRegularClass.getSum(100f, 200f);

		System.out.println(mgi1.getKey()+" "+mgi1.getValue()+" "+mgi2.getKey()+" "+mgi2.getValue());
		System.out.println(i1+" "+f1);
	}

}
