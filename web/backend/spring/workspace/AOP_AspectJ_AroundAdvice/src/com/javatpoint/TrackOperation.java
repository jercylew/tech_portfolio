package com.javatpoint;

import org.aspectj.lang.ProceedingJoinPoint;  
import org.aspectj.lang.annotation.Around;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Pointcut;  

@Aspect  
public class TrackOperation  
{  
	@Pointcut("execution(* Operation.*(..))")  
	public void operationPointcut(){}

	@Around("operationPointcut()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable   
	{
		System.out.println("Additional Concern Before calling actual method");
		Object obj = pjp.proceed();
		
		System.out.println("Additional Concern After calling actual method");
		return obj;
	}
}