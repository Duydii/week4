package com.vektorel;

import java.util.Scanner;

public class Runner_While_Loop {

	public static void main(String[] args) {

		// While d�ng�s� daha �ok belli kriterleri
		// sa�lama durumlar�nda kullan�l�r
		//!!! t�m d�ng�ler birbirleri yerine kullan�labilir
		// Parantez i�i do�ru oldu�u s�rece d�ng� devam eder
		// e�er parantez i�i mutlak true ise sonsuz d�ng� olu�ur
		boolean kosul =false;
		while (kosul) {
		// g�vde kodlar buraya yaz�l�r 
		
		}
		
		//-----------------------------------
		Scanner sc = new Scanner(System.in);
		
		String secim = "E";
		while (secim.equals("E")) {
			
			System.out.println("1. say�y� gir..: ");
			int s1 = sc.nextInt();
			System.out.println("2. say�y� gir..: ");
			int s2 = sc.nextInt();
			int toplam = s1+s2;
			System.out.println("Toplam: "+toplam);
			sc = new Scanner(System.in); // sistem int ten stringe d�nd��� i�in new eklendi
			
			System.out.println("Devam etmek istiyor musun (E/H)");
			secim =sc.nextLine();
		
			
		}
		
		// 
		int faktoriyel =1;
		System.out.println("say� gir.: ");
		int sayi = sc.nextInt();
		// 5! 5*4*3*2*1	
		int sayac=sayi; 
		while (sayac>0) {
			faktoriyel*=sayac;
			sayac--;
		}
		System.out.println("FAkt�riyel..: " +faktoriyel);
		
	}

}
