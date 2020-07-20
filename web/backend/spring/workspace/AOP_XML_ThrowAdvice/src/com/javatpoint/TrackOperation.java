package com.javatpoint;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	
	//The advice
	public void myadvice(JoinPoint jp, Throwable error) throws Throwable   
	{  
		System.out.println("additional concern, " + "Method Signature: "  + jp.getSignature());
        System.out.println("Exception is: " + error);
        System.out.println("end of after throwing advice...");
	}
}