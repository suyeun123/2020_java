package com.ict.edu3;

public class T_sub extends T_sup{
			String addr ;
			int car ;
			
			public T_sub() {
				
				System.out.println("切縦持失切");
			}
			
			public T_sub(String addr) {
				this.addr = addr ;
			}	
				public T_sub(int car) {
					this.car = car ;	
				}
				public T_sub(String addr, int car) {
					this.addr = addr ;
					this.car = car ;
					
				
				
			}
			
			
}
