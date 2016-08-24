package PAT1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test15 {

	/**
	 * PAT ·´×ªÁ´±í
	 */
	 public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String header = input.next();
         int n = input.nextInt();
         int k = input.nextInt();
          
         HashMap<String, Node> nodes = new HashMap<String, Node>();
         for(int i = 0; i<n; i++) {
             String address = input.next();
             nodes.put(address, new Node(address, input.nextInt(), input.next()));
         }
         input.close();
          
         ArrayList<Node> list = new ArrayList<Node>();
         while(!header.equalsIgnoreCase("-1")){
             Node node = nodes.get(header);
             list.add(node);
             header = node.next;
         }
          
         for(int i = 0; i<list.size()-k; i+=k) {
             int l = i;
             int r = i+k-1;
             while(l<r){
                 Node t = list.get(l);
                 list.set(l, list.get(r));
                 list.set(r, t);
                 l++;
                 r--;
             }
         }
          
         int i;
          
         for(i = 0; i<list.size()-1; i++) {
             Node node = list.get(i);
             System.out.println(node.address+" "+node.data+" "+list.get(i+1).address);
         }
         Node node = list.get(i);
         System.out.println(node.address+" "+node.data+" -1");
 }
  
 static class Node{
     String address;
     int data;
     String next;
      
     public Node(String address, int data, String next) {
         this.address = address;
         this.data = data;
         this.next = next;
     }
 }
}
