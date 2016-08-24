package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
	public int a;
	public int b;
	public String s;
	private int m;
	protected int n;
	public void f1(){
		
	}
	public void f2(){
		
	}
	public static int getValue(int i) {
        int result = 0;
        switch (i) {
        case 1:
            result = result + i;
        case 2:
            result = result + i * 2;
        case 3:
            result = result + i * 3;
        }
        return result;
}
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
	
		Test1 test= new Test1();
		Class c1 = Test1.class;
		Class c2 = test.getClass();
		Class c3 = Class.forName("test.Test1");
		Method []m1 = c1.getMethods();
		
		Method []m2= c1.getDeclaredMethods();
		Field []f1 = c1.getDeclaredFields();
		Field []f2 = c1.getFields();
		Field f = c1.getField("a");
		Constructor []cc = c1.getDeclaredConstructors();
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		for(Method mm : m1){
//			System.out.println(mm.getName());
//		}
//		for(Method mm : m2){
//			System.out.println(mm.getName());
//		}
//		for(Field ff : f1){
//			System.out.print(ff.getName()+ " ");
//		}
//		System.out.println();
//		for(Field ff : f2){
//			System.out.print(ff.getName()+" ");
//		}
//		System.out.println();
//		System.out.println(f);
		for(Constructor c : cc){
			System.out.println(c.getName());
		}
	}

}
