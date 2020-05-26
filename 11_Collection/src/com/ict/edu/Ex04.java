package com.ict.edu;

public class Ex04 {
	
	// [ void 메소드]이름, [ void 메소드]총점, [void]평균, [void]학점, 순위 -> 1   (메인에서 입력한것을)
	// 순위를 구해주고[메소드] -> 정렬 -> 출력   [컬렉션으로하기]
		
	private String name ;
	private int sum;
	private double avg;
	private String hak ;
	private int rank = 1;
	
    public void s_sum(int kor, int eng, int math) {
    	sum = kor + eng + math;
    	
    	s_avg();
    }
	

	public void s_avg() {
		
		avg= (int)(sum/0.3/10)/10.0;
		s_hak();
	}
	
	public void s_hak() {
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
