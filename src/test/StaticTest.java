package test;

import java.io.IOException;

class B{
	static{
		System.out.println("��̬�����B");
	}
	{
		System.out.println("�Ǿ�̬�����B");
	}
	public B(){
		System.out.println("���캯��B");
	}
}
class A extends B{
	 static{
		System.out.println("��̬�����A");
	}
	{
		System.out.println("�Ǿ�̬�����A");
	}
	public A(){
		System.out.println("���캯��A");
	}
}
public class StaticTest {

	public static void main(String[] args) {
	  
		try{
			throw new IOException();
		}catch(Exception e){
			System.out.println("�����쳣");
			return ;
		}finally{
			System.out.println("�������");
		}
	}
	
	
}
