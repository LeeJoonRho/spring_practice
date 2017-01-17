package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {	
	}
	
	@Around("pointcutMethod()") 
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
	@Before("within(com.javalec.ex.*)")
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
	}
}
