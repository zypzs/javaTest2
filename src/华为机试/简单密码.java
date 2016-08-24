package 华为机试;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 简单密码 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map <Character,Character> map = new HashMap<Character,Character>();
		map.put('a','2');
		map.put('b','2');
		map.put('c','2');
		map.put('d','3');
		map.put('e','3');
		map.put('f','3');
		map.put('g','4');
		map.put('h','4');
		map.put('i','4');
		map.put('j','5');
		map.put('k','5');
		map.put('l','5');
		map.put('m','6');
		map.put('n','6');
		map.put('o','6');
		map.put('p','7');
		map.put('q','7');
		map.put('r','7');
		map.put('s','7');
		map.put('t','8');
		map.put('u','8');
		map.put('v','8');
		map.put('w','9');
		map.put('x','9');
		map.put('y','9');
		map.put('z','9');
		while(scan.hasNext()){
			char []chars = scan.next().toCharArray();
			char []result = new char[chars.length];
			int i = 0;
			for(char c : chars){
				if(c >= 'A' && c <= 'Z'){
					if(c == 'Z')
						result[i++] = 'a';
					else
					result[i++] = (char) (c+33);
				}else if(c >= 'a' && c <= 'z'){
					result[i++] = map.get(c);
				}else{
					result[i++] = c;
				}
			}
			System.out.println(String.valueOf(result));
		}
	}

}
