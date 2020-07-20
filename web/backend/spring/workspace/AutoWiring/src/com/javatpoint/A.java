package com.javatpoint;

/**
 * 
 * @author Administrator
 * Demo of Auto Wiring by name, it is setter matters, if matched setter found, auto wiring
 * success, even though the property is different
 */

public class A {  
	B bObject;
	CTest objCTest; 
	
	A() {
		System.out.println("a is created");
	}
	
	public B getbObject() {
		return bObject;
	}

	public CTest getObjCTest() {
		return objCTest;
	}

	public void setObjCTest(CTest objCTest) {
		this.objCTest = objCTest;
	}

	public void setbObject(B bObject) {
		this.bObject = bObject;
	}
	
	void print() {
		System.out.println("hello a");
	}
	
	void display() {
		print();
		bObject.print();
		objCTest.print();
	}
} 