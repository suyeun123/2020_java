package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		
		String[] name = {"È«","±è","ÀÌ","¹Ú","°í"};
		
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,70,100};
		int[] math = {100,100,100,100,100};
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = {1,1,1,1,1};
		
		// ÃÑÁ¡, Æò±Õ, ÇÐÁ¡
		for (int i = 0; i < rank.length; i++) {
			// ÃÑÁ¡
			sum[i] = kor[i] + eng[i] + math[i];
			// Æò±Õ
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			// ÇÐÁ¡
			if(avg[i] >= 90) {
					hak[i] = "A ÇÐÁ¡";
			}else if (avg[i] >= 80) {
					hak[i] = "B ÇÐÁ¡";
			}else if(avg[i] >= 70) {
					hak[i] = "C ÇÐÁ¡";
			}else {
					hak[i] = "D ÇÐÁ¡";
					
			}
		}
				
		// rank
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
					
				}
			}
		}
			
		// Ãâ·Â
		System.out.println("ÀÌ ¸§\tÃÑ Á¡\tÆò ±Õ\tÇÐ Á¡\t¼ø À§");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
		
		
		
		
	}
}
