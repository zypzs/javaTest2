package test;

import java.util.*;

public class Gift {
    public static int getValue( int n) {
        if(n == 1){
        	return 0;
        }
        if(n == 2){
        	return 1;
        }
        if(n==3){
        	return 2;
        }
        return getValue(n-1) + getValue(n-2);
    }
    
    public static double length(int n1){
    	double res = 0.0;
    	double n = n1;
    	while(true){
    		res += n;
    		n = n/2;
    		if(n == 0)
    			break;
    		
    	    res += n;
    	}
    	return  res;
    }
    public static void main(String[] args) {
		System.out.println((getValue(10)));
	}
}
