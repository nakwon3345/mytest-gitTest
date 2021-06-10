package co.work.abstract_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;




public class AbstractTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> poketmon = new HashMap<String, Integer>();
		poketmon.put("파이리", 95);
		poketmon.put("꼬부기", 80);
		poketmon.put("이상해씨", 85);
		poketmon.put("리아코", 83);
		poketmon.put("치코리타", 70);
		
//		for(String dto : poketmon.keySet()) {
//			System.out.println(dto + " " + poketmon.get(dto));
//		}
		
		System.out.println(poketmon.size());
		Iterator<String> keys = poketmon.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Integer value = poketmon.get(key);
			System.out.println(key + " : " + value);
		}
		
		poketmon.remove("치코리타");
		
		
		/**
		 * 로그인 정보
		 */
		
		
	}

	public static void main1(String[] args) {
		
		HashSet<String> poketMon = new HashSet<>();
		poketMon.add("파이리");
		poketMon.add("꼬부기");
		poketMon.add("이상해씨");
		poketMon.add("치코리타");
		poketMon.add("리아코");
			
		for(String poketmon : poketMon) {
			System.out.println(poketmon);
		}
		
		System.out.println(poketMon.size());
		
		Iterator<String> iterator = poketMon.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		poketMon.remove("리아코");
		System.out.println(poketMon);
		
		
	}
}
