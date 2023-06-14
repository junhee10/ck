package net.hb.day31;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Work02 {
	public static void main(String[] args) {
		int a=0, b=0;
		int hap=0, sub=0, gob=0, div=0, nmg=0;
		//합계 hap, total, sum	빼기 sub, cha
		//곱 gob, multi			나누기몫 div, mok	나머지 nmg,rest 7%4
		
		a = 19;	b = 5;
		
		hap= a+b;
		sub= a-b;
		gob= a*b;
		div= a/b;
		nmg= a%b;

		System.out.println(a + "+" + b + " = "+ hap);
		System.out.println(a + "-" + b + " = "+ sub);
		System.out.println(a + "*" + b + " = "+ gob);
		System.out.println(a + "/" + b + " = "+ div);
		System.out.println(a + "%" + b + " = "+ nmg);
	}
}
