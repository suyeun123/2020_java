package com.ict.edu7;

public class Main {
			public static void main(String[] args) {
				
			
			Protoss p = new Protoss("�덏", 100, false);
			Zerg z = new Zerg("�Ƿ��", 80, false);
			Terran t = new Terran("Ǫ��", 70, true);
			
			
			p.decEnergy();
			System.out.println(p.name + ":"+p.energy);
			
			p.decEnergy();
			System.out.println(p.name + ":"+p.energy);
			
			
			z.decEnergy();
			System.out.println(z.name + ":"+z.energy);
			
			z.decEnergy();
			System.out.println(z.name + ":"+z.energy);
			
			
			t.decEnergy();
			System.out.println(t.name + ":"+t.energy);
			
			t.decEnergy();
			System.out.println(t.name + ":"+t.energy);
			
			
}
}