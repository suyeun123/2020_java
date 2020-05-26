package com.ict.java01;

public class Ex01 {
			
				public static void main(String[] args) {
					
					
					// 1. 자바에서 사용하는 기본자료형
					
					// 자료형(Data Type) : 자바에서 사용하는 데이타의 형태를 구분
					
					// 자료형    : 키워드
					// boolean형 : boolean : true(참), false(거짓)
					// 문자형    : char    :  숫자가 저장된다. (a => 97 , A = 65 )
					// 정수형    : byte, short, int, long : 일반적으로 정수 int
					// 실수형    : float, double            일반적으로 실수 double
					
					// 주의사항 : 
					//			- String 기본자료형 처럼 사용하지만 기본자료형은 아니다.
					//          - String 처럼 클래스를 자료형으로 사용하는 것을 참조자료형이라고 한다.
					
					
					// 2. 정수값 10을 su라는 변수에 넣고 변수 su에 데이터가 들어갔는지 확인하는
							int su = 10 ;
							System.out.println(su);
							
							// boolean b1에 참을 저장하자
							boolean b1 = true;
							System.out.println(b1);
							
							//  실수값 3.14를 d1에 저장하자
							double d1 = 3.14;
							System.out.println(d1);
							
					// 3.  a++ 과 ++a 의 차이점을 쓰시오
					//      a++ : 현재 변수값으로 계산한후 연산 한 후에 나중에 변수값을 1증감 시킨다.
							int a = 10 ;
							System.out.println(a++);
							System.out.println(a);
							
					//      a++ : 현재 변수값 먼저 1증가 시키고 난후 나머지 연산을 수행한다.
							
							int b = 10;
							System.out.println(++b);
							System.out.println(b);
							
							
					// 4. 논리연산자 AND와 OR에 대해서 쓰시오
							
					// AND ( 논리곱, 교집합, &&) : 주어진 조건들이 모두 true일때 결과가 true
					//                         만약에 조건들 중 하나라도 false가 있으면 결과는 false
					//						   false를 만나면 false 뒤에 연산은 하지 않는다.
							
					// OR (논리합, 합집합, ||) : 주어진 조건들이 모두 false일때 결과 false
					//								 만약에 조건들 중 하나라도 true되면 결과는 true
					//							true를 만나면 true뒤에 연산은 하지 않는다.
							
							boolean b2 = true;
							boolean b3 = true;
							boolean b4 = false;
							boolean b5 = false;
							
							boolean res = b2 && b3 ;
							System.out.println("res = " + res);
							
							res = b3 && b4;
							System.out.println("res = " + res);
							
							res = b4 && b5;
							System.out.println("res = " + res);
							
							System.out.println("======================================================");
							
							res = b2 || b3 ;
							System.out.println("res = " + res);
							
							res = b3 || b4;
							System.out.println("res = " + res);
							
							res = b4 || b5;
							System.out.println("res = " + res);
					
							
							System.out.println("======================================================");
							
							
							// 5. int su = 24 일때 삼항연산자를 활용해서
							// 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오
							// 삼항연산자 :  
							// 자료형 변수이름 = (조건식 = boolean) ?  참일때 실행 : 거짓일때 실행
							
							// 자료형 변수이름, 참일때 실행 결과값, 거짓일때 실행 결과값 모두 같은 자료형이어야 된다.
							
							int num = 24;
							String msg = (num % 2 == 1 ) ?  "홀수" : "짝수" ;
//							String msg = (num % 2 == 0 ) ?  "짝수" : "홀수" ;
									
							System.out.println(msg);
							
							
					
				}
	
}
