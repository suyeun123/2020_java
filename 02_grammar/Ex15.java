class Ex15{


	public static void main(String[] args){

	// �������� : &&(AND, ����), || (OR, ����), !(NOT, ������)
	// ���������� ���(������ ����) : boolean��, �񱳿���, ������
	// �������� ����� boolean��. ��, ���ǽĿ� ���ȴ�.

	// AND (&&, ����)
	// - �־��� ������ ��� true�϶� ����� true
	// - �־��� ���� �� false�� ������ ����� false
	// - false�� ������ ���� ������ ���� ����.
	// - ' a >= 10 && a <= 20' �� �ǹ̴� a�� 10���� 20������ ������ �ǹ��Ѵ�.


	int su1 = 10 ;
	int su2 = 7 ;
	boolean result = false;

		result = (su1 >= 7) && (su2 >=5) ; // true = true && false
		System.out.println("���" + result); 

		result = (su1 >= 7) && (su2 <=5) ; // false = true && false
		System.out.println("���" + result); 

		result = (su1 <= 7) && (su2 <=5) ; // false = false && false
		System.out.println("���" + result); 

		System.out.println("===============================");

		result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
		System.out.println("��� : " + result);
		System.out.println("su1 : " + su1);	
		System.out.println("su2 : " + su2);
	
		System.out.println("===============================");
 		
		// AND�� false�� ������ ����� false�̰�, �� ������ �������� �ʴ´�.

		result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
		System.out.println("��� : " + result);
		System.out.println("su1 : " + su1);	
		System.out.println("su2 : " + su2);
	

		su1 = 34;
		// su1�� 20 ~ 30 ������ ���̳�?
		result = (su1>=20) && (su1<=30) ;
		System.out.println("���" + result);
	
		char c1 = 'g' ;
		result = (c1>97) && (c1<=122);
		System.out.println("���" + result);

		result = (c1>'a') && (c1<='z');
		System.out.println("���" + result);
			



}
}