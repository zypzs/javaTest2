package huaweitest;

import java.util.*;

class Timer{
	int id;
	int time;
	boolean flg;
	public Timer(int id,int time){
		this.id = id;
		this.time = time;
		this.flg = false;
	}
}
public class TimerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map <Integer,Timer> map = new HashMap<Integer,Timer>();
 		while(scan.hasNext()){
			String str = scan.nextLine();
			if("end".equals(str.trim())){
				timerPrint(map);
				map.clear();
			}else{
				String []strs = str.split(":");
				if("starttimer".equals(strs[0])){
					int id = Integer.valueOf(strs[1].substring(0, strs[1].indexOf(",")));
					int time = Integer.valueOf(strs[1].substring(strs[1].indexOf(",")+1));
					map.put(id,new Timer(id,time));
				}else if("stoptimer".equals(strs[0])){
					int id = Integer.valueOf(strs[1].trim());
					if(map.containsKey(id)){
						Timer t = map.get(id);
						t.flg = true;
						map.put(id,t);
					}
				}else{
					int time = Integer.valueOf(strs[1].trim());
					Set<Integer> set = map.keySet();
					for(int key : set){
						if(!map.get(key).flg){
						Timer t = map.get(key);
						t.time = t.time - time;
						if(t.time <= 0){
							t.flg = true;
						}
						map.put(key, t);
					}
					}
				}
			}
		}
	}

	private static void timerPrint(Map<Integer,Timer> map) {
		Set<Integer> set = map.keySet();
		boolean printFlg = false;
		for(int key : set){
			if(!map.get(key).flg ){
				System.out.println("timer:" + key + "," + map.get(key).time);
				printFlg = true;
			}
		}
		if(!printFlg){
			System.out.println("none");
		}
		
	}

}
