package com.itheima.test;

public class test {
	public static void main(String[] args) {
		String a1="ab";
		String a2=new String("ab");
		String a3="a";
		String a4="b";
		String a5="a"+"b";
		String a6=a3+a4;
//		System.out.println(a1==a2);
//		System.out.println(a1==a5);
		System.out.println(a1.hashCode());
		
		System.out.println(a6.hashCode());
		System.out.println(a1==a6);
//		System.out.println(a1==a6.intern());
//		System.out.println(a2==a2.intern());
		
	}
}
