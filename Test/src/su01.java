import java.util.Scanner;

public class su01 {
		
       public static void main(String[] args) {
		
    //������	   
    int sum = 0;
    
    for (int i = 1; i < 11; i++) {
		sum = sum + i;
	}
    	   
    	   System.out.println(sum);
    	   
    // 0~10 Ȧ���� �հ�
    	   int odd = 0;
    	   
    	   for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i ;
			}
		}
    	   System.out.println(odd);
    // ���� �Է��ϸ� ���ð� ���
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.print("�����Է� : 1.�ѱ�, 2. �߱� 3. �Ϻ� >>");
    	   int num = sc.nextInt();
    	   String result = "";
    	   if(num == 1) {
    		   result = "����";
    	   }else if (num == 2) {
    		   result = "����¡"; 
    		   }else if (num == 3) {
    			   result = "����";
    		   }else {
    			   result = "�����;���";
    	   }
    	   System.out.println("��� : " + result);
    	   
    // �˹ٻ��� �˹ٺ�
    	   
    	  System.out.print("�˹ٽð�?");
    	   	 int time = sc.nextInt();
    	   	 
    	   int dan = 8590;
    	   int pay = 0;
    	   if (time > 8) {
			pay = (8*dan) + (int)((time-8)*dan*1.5);
		}else {
			pay = time * dan;
		}
    	   	System.out.println("�˹ٺ񳻳�"+pay);
    	   	
    	   	
    //	   	
    	   	
	}
	
}
