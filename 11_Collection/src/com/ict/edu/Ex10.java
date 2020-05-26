package com.ict.edu;

import java.util.LinkedList;

public class Ex10 {
			public static void main(String[] args) {
				
				// Queue(큐) 인터페이스 : FIFO(First-In-First-Out) => 먼저들어온 정보가 먼저 나감
				// 구현 클래스 : LinkedList
				
				LinkedList<String> list = new LinkedList<String>();
				//추가, 삽입 : add, addFirst, addLast, offerFirst, offerLast
				
				
				list.add("펭수");
				list.offer("펭뜌");
				list.addFirst("펭길동");
				list.offerFirst("펭도도");
				
				list.addLast("펭길동");
				list.offerLast("펭도도");
				
				System.out.println(list);
				System.out.println("===================================");
				
				// 검색
				if(list.contains("펭수")) {
					System.out.println(list.indexOf("펭수")+"번째위치");
					System.out.println(list.lastIndexOf("펭수")+"번째위치");
					System.out.println(list.getFirst());
					System.out.println(list.getLast());
					System.out.println(list.get(list.indexOf("펭뜌")));
					
					
				}
				// 삭제 : remove(Object), remove(index), removeFirst(), removeLast();
				list.removeFirst();
				list.remove("펭길동");
				list.remove(2);
				list.removeLast();
				
				System.out.println(list);
				
				//출력
				for (String k : list) {
					System.out.println(k);
				}
				
				
				
			}
}
