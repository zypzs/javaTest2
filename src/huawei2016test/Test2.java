package huawei2016test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map <String,Integer> map = new HashMap<String,Integer>();
		while(scan.hasNext()){
			String str1 = scan.next();
			String str2 = scan.next();
			String path = str1.substring(str1.lastIndexOf("\\")+1);
			String key = "";
			if(path.length() > 16){
				key = path.substring(path.length()-16) + " " + str2;
			}else
				key = path + " " + str2;
			if(map.get(key) != null){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
			sortMap(map);
		}
		scan.close();
	}

	private static void sortMap(Map<String, Integer> map) {

		List <String> list = new ArrayList<String>();
		List<String> set1 = new ArrayList<String>();
		int index = 0;
		while(index ++ < map.size()){

			int max = Integer.MIN_VALUE;
			int max1 = Integer.MAX_VALUE;
			String key = "";
			Set<String> set = map.keySet();
			Iterator<String> ite = set.iterator();
			while(ite.hasNext()){
				String key1 = ite.next();
				if(set1.contains(key1))
					continue;
				if(map.get(key1) > max){
					max = map.get(key1);
					key = key1;
				}
			}
			set1.add(key);
            list.add(key + " " + max);
		}
		for(String str : list){
			System.out.println(str);
		}
	}
}
