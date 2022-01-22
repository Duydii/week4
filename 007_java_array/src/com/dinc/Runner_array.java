package com.dinc;

public class Runner_array {

	public static void main(String[] args) {

		// arrays --> diziler
		// çoklu deðer yakalamak ve saklamak için kulllanýlýr
		
		// {1,12,121,123,} bu bir kümedir--dizidir
		int sayi = 48;
		int sayi2;
		
		int[] sayi_dizisi= {1,222,333,555,6666}; // bu þekilde býrakýlýrsa deðer null
		// sayi dizisinin boyutlarýný belirleyerek default deðer atýyoruz.
		// tanýmý yapýlan deðiþken türünün default deðeri ne ise
		// oluþan dizi içindeki tüm deðerler bu þekilde oluþur
		// int-> 0
		// double -> 0.0
		//String -> null
		// Bunlar Dizilerin SYNTAX ý
		
		int[] sayi_dizisi2 = new int[5]; // dizi içindeki deðerler {0,0,0,0,0}
		// dizinin içinden deðer okumak
		// NOTT: ÇOK ÖNEMLÝ --> diziler baþlangýç olarak 0 indis deðeri ile baþlar
		// uzunluk 5 ise 4 e kadar , 100 ise 99 a kadar gider
		// index deðeri ve sayý deðeri ayný deðil!!!
		// diziye deðer atamak
		sayi_dizisi2[0] =45;
		sayi_dizisi2[1] =52;
		sayi_dizisi2[2] =-66;
		sayi_dizisi2[3] =5852;
		sayi_dizisi2[4] =22;
										
		System.out.println("3. index deðeri: " );
		System.out.println(sayi_dizisi2[3]);
		
		System.out.println("içinde ne var: "+ sayi_dizisi[4]);
		
		// neler dizi olarak tnaýmlanabilir?
		// ALL
		String[] ifade_dizisi;
		double[] ondalik_dizisi;
		boolean[] secim_dizisi;
		Runner_array[] sinif_dizisi;
		
		
		
		
	}// main sonu

}//class sonu
