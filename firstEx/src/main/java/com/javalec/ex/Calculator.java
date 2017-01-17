package com.javalec.ex;

public class Calculator {
	
	public void add(int fn, int sn) {
		System.out.println("add");
		int result=fn+sn;
		System.out.println(fn+" + "+sn+" = "+result);
	}
	
	public void sub(int fn, int sn) {
		System.out.println("sub");
		int result=fn-sn;
		System.out.println(fn+" - "+sn+" = "+result);
	}
	
	public void mult(int fn, int sn) {
		System.out.println("mult");
		int result=fn*sn;
		System.out.println(fn+" X "+sn+" = "+result);
	}
	
	public void div(int fn, int sn) {
		System.out.println("div");
		int result=fn/sn;
		System.out.println(fn+" / "+sn+" = "+result);
	}
}
