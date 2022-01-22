package com.dinc;

import java.util.Scanner;

public class runner_if_elseif {

	public static void main(String[] args) {

	
		double vize_notu, final_notu, ortalama;
		String ortalama_harf;
		String aciklama = "Not Ortalamasý: ";
		Scanner sc = new Scanner(System.in);
		System.out.println("vize notu...: ");
		vize_notu = sc.nextDouble();
		System.out.println("final notu...: ");
		final_notu = sc.nextDouble();
		ortalama = vize_notu*0.35 + final_notu*0.65;
		System.out.println("Not Ortalamasý: " +ortalama);
		//0-10 FF, 11-20 FD, 21-30 DD, 31-40 DC, 41-50 CC, 51-60 CB, 61-70 BB
		// 71-85 BA, 86-100 AA
		
		if(ortalama>=0 && ortalama<=10) {
			ortalama_harf = "FF";
			
		//	}else if (ortalama>10 && ortalama <=20) {
		//System.out.println("Not: FF");
						
		}else if (ortalama>10 && ortalama <=20) {
			ortalama_harf = "FD";
			
		}else if (ortalama>20 && ortalama <=30) {
			ortalama_harf = "DD";
			
		}else if (ortalama>30 && ortalama <=40) {
			ortalama_harf = "DC";
			
		}else if (ortalama>40 && ortalama <=50) {
			ortalama_harf = "CC";
			
		}else if (ortalama>50 && ortalama <=60) {
			ortalama_harf = "CB";
			
		}else if (ortalama>60 && ortalama <=70) {
			ortalama_harf = "BB";
			
		}else if (ortalama>70 && ortalama <=85) {
			ortalama_harf = "BA";
			
		}else if (ortalama>85 && ortalama <=100) {
			ortalama_harf = "AA";
			
		}
		
		if (ortalama<=10) ortalama_harf="FF";
		else if (ortalama<=20) ortalama_harf="FD";
		else if (ortalama<=30) ortalama_harf="DD";
		else if (ortalama<=50) ortalama_harf="DC";
		else if (ortalama<=60) ortalama_harf="CC";
		else if (ortalama<=70) ortalama_harf="CB";
		else if (ortalama<=80) ortalama_harf="BB";
		else if (ortalama<=90) ortalama_harf="BA";
		else ortalama_harf="AA";
		
		
				
				
				
		// NOT: Koþul için gövde yazýlmazsa yani {} kullanýlmazsa ilk kod bloðu
		// koþula dahildir
		
		if (true) {
			System.out.println("çalýþ");
		}
		
		if (true)
			
			System.out.println("çalýþþþ");
			System.out.println("if bloðuna dahil deðildir burasý");
		
		System.out.println(aciklama+ortalama_harf);
			
	}//main sonu

} // class sonu
