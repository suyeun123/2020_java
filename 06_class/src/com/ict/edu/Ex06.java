package com.ict.edu;

public class Ex06 {
		
		// getter : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ� 
		// setter : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ� 
		public String name = "ȫ�浿";
		int age = 24 ;
		private double weight = 70.4 ;
		
		// getter : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ� 
		public String s_name() {
			return name ;
		}
		
		public int s_age() {
			return age ;
		}
		
		public double s_weight() {
			return weight ;
		}
		
		
		
		// setter : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ� 
		public void re_name(String s) {
			name = s ;
		}
		
		
		
		public void re_age(int s) {
			age = s ;
			
		}
		
		public void re_weight(double s) {
			weight = s;
		}
		
		
		
		
		
		
		
		
}
