package com.dinc;

public class Runner_array {

	public static void main(String[] args) {

		// arrays --> diziler
		// �oklu de�er yakalamak ve saklamak i�in kulllan�l�r
		
		// {1,12,121,123,} bu bir k�medir--dizidir
		int sayi = 48;
		int sayi2;
		
		int[] sayi_dizisi= {1,222,333,555,6666}; // bu �ekilde b�rak�l�rsa de�er null
		// sayi dizisinin boyutlar�n� belirleyerek default de�er at�yoruz.
		// tan�m� yap�lan de�i�ken t�r�n�n default de�eri ne ise
		// olu�an dizi i�indeki t�m de�erler bu �ekilde olu�ur
		// int-> 0
		// double -> 0.0
		//String -> null
		// Bunlar Dizilerin SYNTAX �
		
		int[] sayi_dizisi2 = new int[5]; // dizi i�indeki de�erler {0,0,0,0,0}
		// dizinin i�inden de�er okumak
		// NOTT: �OK �NEML� --> diziler ba�lang�� olarak 0 indis de�eri ile ba�lar
		// uzunluk 5 ise 4 e kadar , 100 ise 99 a kadar gider
		// index de�eri ve say� de�eri ayn� de�il!!!
		// diziye de�er atamak
		sayi_dizisi2[0] =45;
		sayi_dizisi2[1] =52;
		sayi_dizisi2[2] =-66;
		sayi_dizisi2[3] =5852;
		sayi_dizisi2[4] =22;
										
		System.out.println("3. index de�eri: " );
		System.out.println(sayi_dizisi2[3]);
		
		System.out.println("i�inde ne var: "+ sayi_dizisi[4]);
		
		// neler dizi olarak tna�mlanabilir?
		// ALL
		String[] ifade_dizisi;
		double[] ondalik_dizisi;
		boolean[] secim_dizisi;
		Runner_array[] sinif_dizisi;
		
		
		
		
	}// main sonu

}//class sonu
