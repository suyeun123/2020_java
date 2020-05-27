package com.ict.edu8;

import java.io.Serializable;

public class VO implements Serializable{

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	
	public VO() {}
	

	public VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		sum = kor + eng + math;
		avg =  (int)(sum/3.0 *10)/10;
		
		if (avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
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
	
	
	
	
	
	
	
	
	
	
}
