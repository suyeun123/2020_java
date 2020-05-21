package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
		private static final Character Character = null;

		public static void main(String[] args) {
			
			// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet;
			// 특징 : 중복아노딤, 정렬안됨 (TreeSet은 항상 오름차순 상태)
			
			// 컬렉션 생성 : HashSet<제네닉=객체타입=클래스> 참조변수 = new	HashSet<제네닉>();
			HashSet<Integer> h1 = new HashSet<Integer>(); //정렬안됨
			HashSet<Double> h2 = new HashSet<Double>();   // 정렬안됨
			HashSet<Boolean> h3 = new HashSet<Boolean>();  //정렬안됨
			TreeSet<Character> h4 = new TreeSet<Character>();
			TreeSet<String> h5 = new TreeSet<String>();
			
			
			// 해당 컬렉션에 객체로 만든 후 넣어야 된다.)
			// 1. 객체로 만들기
			Integer k1 = new Integer(10); // 박싱
			Integer k2 = new Integer("20");
			
			// 2. 컬렉션에 넣기(add)
			h1.add(k1);
			h1.add(k2);
			h1.add(new Integer(30));
			h1.add(new Integer("40"));
			h1.add(50);   // 오토박싱 : 자료형 int 10을 자동으로 객체로 만들어서 넣어준다.
			h1.add(60);	  // 오토박싱 : 자료형 int 10을 자동으로 객체로 만들어서 넣어준다.
			
			
			// Double 넣기
			Double d1 = new Double(10);
			Double d2 = new Double("20");
			
			h2.add(d1);
			h2.add(d2);
			
//			h2.add(10);   => 작은것이 큰게 들어갈수있는 개념이 아닌 똑같아야 들어가짐<오토박싱>
			h2.add(10.0);
			
			h3.add(true);
			h3.add(false);
			h3.add(true);		// 오류는 나지않지만, 중복은 출력이 되지않음.
			
			h4.add('j');
			h4.add('a');
			h4.add('v');
			h4.add('a');		// 오류는 나지않지만, 중복은 출력이 되지않음.
			
			h5.add("펭슈");
			h5.add("펭수");
			h5.add("펭소");
			h5.add("펭듀");
			h5.add("펭도");
			
			
			System.out.println("============================================");
			
			System.out.println("전체내용봐");
			
			System.out.println(h1);
			System.out.println(h2);
			System.out.println(h3);
			System.out.println(h4);
			System.out.println(h5);
			
			

			System.out.println("============================================");
			
			System.out.println("하나씩보소 <개선된 for, iterator>");
			for (Integer k : h1) {
				System.out.print(k+" ");
			}
			System.out.println();
			
			// 언박싱 : 객체를 일반적으로 사용하는 자료형으로 변환
			for (int k : h1) {
				System.out.print(k+" ");
			}
			System.out.println();
			System.out.println("============================================");
			
			System.out.println("하나씩보소 <iterator>");
			
			Iterator<Double> it = h2.iterator();
			
			// hasNext() = > 다음객체가 존재하면 true
			while (it.hasNext()) {
				// 다음객체를 꺼내기 위해서 이동학 반환한다.
			double res = (double) it.next();
				System.out.print(res);
			}
			
			System.out.println();
			System.out.println("============================================");
			
			//h4출력하기
			// for문활용
			for (char k : h4) {
				System.out.println(k);
			}
			//while문활용
			Iterator<Character> it2 = h4.iterator();
			while (it2.hasNext()) {
				char res = (char) it2.next();
				System.out.print(res);
			}
			System.out.println();

			//h5출력하기
			// for문활용
			for (String k : h5) {
				System.out.println(k);
			}
			//while문활용
			Iterator<String> it3 = h5.iterator();
			while (it2.hasNext()) {
				String res = (String) it3.next();
				System.out.print(res);
			}
			
			
			
			
			
		}
}
