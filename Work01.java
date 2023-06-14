package net.hb.day31;

public class Work01 {

	public static void main(String[] args) {
		int kor = 0, eng = 0, com = 0, hap = 0;
		double avg = 0.0 ;
		//합계, 평균 연산처리
		kor = 90;
		eng = 85;
		com = 78;
		hap = kor+eng+com;
		avg = (double)hap/3;
		System.out.println("국어\t영어\t컴퓨터\t합계\t평균\t");
		System.out.println(kor+"\t"+eng+"\t"+com+"\t"+hap+"\t"+avg+"\t");
	}

}
