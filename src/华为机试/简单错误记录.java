package 华为机试;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class 简单错误记录 {

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
		int num = 0 ;
		for(String str : list){
			System.out.println(str);
			if(num ++ == 8)
				break;
		}
	}
}

/*
 * 别人实现的代码
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Main {
    static class EFile{
        public String name;
        public int line;
        public int num;
        public int order;
         
         
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + line;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
 
            EFile other = (EFile) obj;
            if (this == obj){ other.num++; return true;
            }
            if (getClass() != obj.getClass())
                return false;
             
            if (line != other.line){
                return false;
            }
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name)){
                return false;
            } other.num++;  return true;
        }
         
    }
    public static void main(String[] args){
        Set<EFile> set = new HashSet<EFile>();
        Scanner in = new Scanner(System.in);
        int j = 0;
        while (in.hasNext()) {
            String s = in.next();
            int line = in.nextInt();
            EFile file = new EFile();
            int bi = s.lastIndexOf("\\");
            file.name = s.substring(bi+1);
            file.line = line;
            if(set.add(file)){
                file.num++;
                file.order = j;
                j++;
            }
             
        }
        in.close();
        List<EFile> list = new ArrayList<EFile> (set);
        Comparator<EFile> cmp = new Comparator<EFile>() {
            @Override
            public int compare(EFile o1, EFile o2) {
                return o1.num - o2.num ==0 ?(o1.order-o2.order):(o2.num-o1.num);
            }
        };
        Collections.sort(list,cmp);
        StringBuffer sb = new StringBuffer();
         
        for(int i = 0; i < (list.size() > 8 ? 8 : list.size()); i ++){
            StringBuffer result;
            EFile eFile = list.get(i);
            if(eFile.name.length() > 16){
                result =new StringBuffer(eFile.name.substring(eFile.name.length() - 16, eFile.name.length()));
            }else{
                result =new StringBuffer(eFile.name);
            }
            result.append(" ").append(eFile.line).append(" ").append(eFile.num);
            System.out.println(result.toString());
        }
         
 
    }
}*/
