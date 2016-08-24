package test;

import java.io.IOException;

class B{
	static{
		System.out.println("静态代码块B");
	}
	{
		System.out.println("非静态代码块B");
	}
	public B(){
		System.out.println("构造函数B");
	}
}
class A extends B{
	 static{
		System.out.println("静态代码块A");
	}
	{
		System.out.println("非静态代码块A");
	}
	public A(){
		System.out.println("构造函数A");
	}
}
public class StaticTest {

	public static void main(String[] args) {
	  
		try{
			throw new IOException();
		}catch(Exception e){
			System.out.println("捕获异常");
			return ;
		}finally{
			System.out.println("最终输出");
		}
	}
	
	
}
