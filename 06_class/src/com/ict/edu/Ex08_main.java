package com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		
		Ex08 coffee = new Ex08();
		coffee.setName("Ŀ������");
		coffee.setPrice(1000);
		
		Ex08 ion= new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola= new Ex08();
		cola.setName("ź������");
		cola.setPrice(1200);
		
		
		Ex08 juice= new Ex08();
		juice.setName("��������");
		juice.setPrice(2500);
		
		/* �迭
		Ex08 arr[] = new Ex08[4];
		arr[0] = coffee;
		arr[1] = ion;
		arr[2] = cola;
		arr[3] = juice;
		*/
		
		
		Ex08[] arr = {coffee,ion,cola,juice};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int input = sc.nextInt(); //�����ݾ��� ����
		
		if(input<1000) {
				System.out.println("����������!!!: ");
		}else {
			System.out.println("ĿǶ\t�̿�\tź��\t����");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		
				System.out.println();
				System.out.println("�����ض� >>");
				String drink = sc.next();
				int output = 0;
				
				switch (drink) {
					case "Ŀ��":output = input - arr[0].getPrice();break;
					case "�̿�":output = input - arr[1].getPrice();break;
					case "ź��":output = input - arr[2].getPrice();break;
					case "����":output = input - arr[3].getPrice();break;
												
					}
					System.out.println("�ܵ� :" + output);
			}
				
				
		
	}

	
