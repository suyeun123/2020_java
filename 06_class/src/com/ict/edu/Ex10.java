package com.ict.edu;

public class Ex10 {
	private String name ;
	private int sum ;
	private double avg ;
	private String hak ;
	private int rank = 1 ;
	
	// �հ豸�ϱ� 
	public int s_sum(int kor, int eng, int math) {
		return kor + eng + math ;
	}
	
	// ��ձ��ϱ� 
	public double s_avg() {
		return (int)(sum/3.0*10) / 10.0 ;
	}
	
	// �������ϱ�
	public String s_hak() {
		if(avg>=90) {
			hak = "A";
		}else if(avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak = "F";
		}
		return hak;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
