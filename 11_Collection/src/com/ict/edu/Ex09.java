package com.ict.edu;

import java.util.ArrayList;
import java.util.Vector;

public class Ex09 {
		
			public static void main(String[] args) {
				
				// List 인터페이스 : 배열과 흡사한 구조, 삽입, 삭제, 추가가 자유롭다.
				//					 크기를 미리 정하지 않아도 된다.
				
				// 관련 클래스 : Stack, ArrayList, Vector;
				
				// ArrayList : 멀티스레드 동기화 지원하지 않음
				// Vector : 멀티스레드 동기화 지원함
				// ArrayList와 Vector 사용법은 같다.
				
				ArrayList<String> list = new ArrayList<String>();
				//추가, 삽입 : add
				list.add("박찬호");
				list.add("손흥민");
				list.add("류현진");
				list.add(1, "펭소소");
				
				
				System.out.println(list);
				System.out.println("=============================================");
				
				Vector<String> Vector = new Vector<String>();
				Vector.add("펭소소");
				Vector.add("류현진");
				Vector.add("손흥민");
				Vector.add(2, "박찬호");
				
			 System.out.println(Vector);
				
				if (list.contains("펭소소")) {
					System.out.println(list.indexOf("펭소소")+ "번째위치");
					System.out.println(list.get(2));
					System.out.println(list.lastIndexOf("펭소소")+ "번째위치");
					//박찬호대신 펭뚀로 변경
					System.out.println(list.set(0, "펭뚀"));
					// search, elementAt,firstElement(),lastElement() : 없음
					// elementAt,firstElement(),lastElement() : Vector에는 존재
					
				} else {
						System.out.println("없오");
				}
				
				System.out.println(list);
				System.out.println("=============================================");
				
				if(Vector.contains("펭소소")){
					System.out.println(Vector.indexOf("펭소소")+"펭소소 위치");
					System.out.println(Vector.get(2));
					System.out.println(Vector.lastIndexOf("펭소소")+"번째 위치");
					System.out.println(Vector.elementAt(1));
					System.out.println(Vector.firstElement());
					System.out.println(Vector.lastElement());
				}
				
				System.out.println("=============================================");
				// 치환
				Vector.set(1, "펭도리질");
				Vector.setElementAt("펭돌펭돌", 2);
				System.out.println(Vector);
				
				
				// 크기
				System.out.println(list.size());
				System.out.println(Vector.size());
				
			}
				
}
