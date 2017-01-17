package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	//공통기능
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		//메소드 시작전에 실행
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start.");
		long st=System.currentTimeMillis();

		try {
			//메소드 실행
			Object obj = joinpoint.proceed();
			return obj;
		}
		finally {
			//메소드 끝난 후 실행
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et-st));
		}
	}

}
