package com.ict.edu7;


// Unit �߻�Ŭ�����̱� ������
// �Ϲ� Ŭ������ protoss�� �ݵ�� �������̵� �ؾ��Ѵ�.

public class Protoss extends Unit {
		
	
	String name;
	int energy;
	boolean fly ;
	
	public Protoss() { 	}
	

	public Protoss(String name, int energy, boolean fly) {
		
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}


	@Override
	public void decEnergy() {
		energy = energy - 2 ;
		
		
		
		
		
		
		
	}
			
}
