package com.imooc.ioc.interfaces;

public class Main {

	// 面向接口编程的一个简单说明
	public static void main(String[] args) {
		OneInterface oif = new OneInterfaceImpl();
		
		System.out.println(oif.hello("word."));
	}
}
