package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = null;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(str.equals("dev"))
			config="dev";
		else if(str.equals("run"))
			config="run";
		
		sc.close();
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		ServerInfo serinfo = ctx.getBean("serverInfo" , ServerInfo.class);
		System.out.println("ip : "+serinfo.getIpNum());
		System.out.println("port : "+serinfo.getPortNum());
		ctx.close();
	
}

}
