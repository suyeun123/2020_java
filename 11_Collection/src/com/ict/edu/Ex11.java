package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
			public static void main(String[] args) {
				
				// Map 인터페이스 : key와 Value를 맵핑하는 구조로 이루어짐
				// 					key는 중복될 수 없다.
				//					key를 호출하면 Value가 나온다.
				//					key를 별도로 관리 => keySet()
				//					add()로 추가 못함
				//					put(key, value) 추가한다.
				
				
				// Map생성 (key숫자로 만든다.)
				HashMap<Integer, String>map1 = new HashMap<Integer, String>();
				
				// 추가 : add X, put(k,v)
				map1.put(0, "한국");
				map1.put(1, "미국");
				map1.put(2, "스웨덴");
				map1.put(3, "이탈리아");
				map1.put(4, "덴마크");
				map1.put(5, "한국");    // value의 중복은 상관없다.
				map1.put(4, "오로라");  //key중복은 덮어씌어진다.
				
			 System.out.println(map1);
				
			 // 하나씩 출력 (get(key) => value가 나온다.)
			 System.out.println(map1.get(2));
			 System.out.println(map1.get("한국"));
			 System.out.println("=======================================");
				
			 // 일부러 key를 순서대로 만들었기 때문에 for문을 사용할 수 있다.
			 // map에서 value를 호출하는 방법 ; get(key)
			 for (int i = 0; i < map1.size(); i++) {
				System.out.println(map1.get(i));
			}
				
			 System.out.println("=======================================");
			 // 1씩증가하지 않아도, 일정한 규칙이 없이도 사용
			 for (Integer k : map1.keySet()) {
				System.out.println(map1.get(k));
			}
			 System.out.println("=======================================");
				
			 // Map생성 (Key를 문자열(String)로 만든다 => 일반적인 방법)
			  HashMap<String, String> map2 = new HashMap<String, String>();
			  map2.put("이름", "펭도도");
			  map2.put("나이", "100");
			  map2.put("주소", "알래스카 빙하시");
			  map2.put("성별", "중성");
			  map2.put("취미", "참치낚시");
			  
			  System.out.println(map2.get("이름"));
			  System.out.println(map2.get("나이"));
			  System.out.println(map2.get("주소"));
			  System.out.println(map2.get("성별"));
			  System.out.println(map2.get("취미"));
			  System.out.println("=======================================");
			  
			  
			  
			  for (String k : map2.keySet()) {
				System.out.println(map2.get(k));
				
				
				
			  System.out.println("=======================================");		  
				
			  Iterator<String> it = map2.keySet().iterator();
			  while (it.hasNext()) {
				String res = (String) it.next();
				System.out.println(map2.get(res));
			}
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			}
			  
			  
			
				
			}
}
