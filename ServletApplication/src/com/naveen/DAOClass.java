/**
 * 
 */
package com.naveen;

/**
 * @author Naveen Kumaravelmurugaian
 *
 */
public class DAOClass {
	public NumberClass add(Integer n1, Integer n2) {
		NumberClass obj1 = new NumberClass();
		obj1.setNum1(n1);
		obj1.setNum2(n2);
	
		Integer answer = n1 + n2;
		obj1.setAns(answer);
		return obj1;

	}
}
