import java.util.Scanner;

public class su01 {
		
       public static void main(String[] args) {
		
    //누적합	   
    int sum = 0;
    
    for (int i = 1; i < 11; i++) {
		sum = sum + i;
	}
    	   
    	   System.out.println(sum);
    	   
    // 0~10 홀수의 합계
    	   int odd = 0;
    	   
    	   for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i ;
			}
		}
    	   System.out.println(odd);
    // 나라를 입력하면 도시가 출력
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.print("나라입력 : 1.한국, 2. 중국 3. 일본 >>");
    	   int num = sc.nextInt();
    	   String result = "";
    	   if(num == 1) {
    		   result = "서울";
    	   }else if (num == 2) {
    		   result = "베이징"; 
    		   }else if (num == 3) {
    			   result = "도쿄";
    		   }else {
    			   result = "데이터없음";
    	   }
    	   System.out.println("결과 : " + result);
    	   
    // 알바생의 알바비를
    	   
    	  System.out.print("알바시간?");
    	   	 int time = sc.nextInt();
    	   	 
    	   int dan = 8590;
    	   int pay = 0;
    	   if (time > 8) {
			pay = (8*dan) + (int)((time-8)*dan*1.5);
		}else {
			pay = time * dan;
		}
    	   	System.out.println("알바비내놔"+pay);
    	   	
    	   	
    //	   	
    	   	
	}
	
}
