package com.dinc;

import java.util.Scanner;

public class runner_switchcase {

	public static void main(String[] args) {

		// if vs. Switch 
		// belli aral�klar i�in if kullan�l�r. Switch..case kullan�lmaz
		// nokta at��� de�er kontrol� yapmak i�in switch..case kullan�l�r
		// switch case ile yap�labilen her kurgu if ile yap�labilir.
		// tam tersi olmaz
		// iki durum i�inde kullan�lan bir kurguda, switch case , if else den 
		//daha h�zl�
		
		System.out.println();
		System.out.println("*****��LEMLER*****");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. ��karma");
		System.out.println("3. �arpma");
		System.out.println("4. B�lme");
		System.out.println("5. Mod");
		System.out.println("0. �IKI�");
		System.out.println();
		System.out.println("Se�: ");
		
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		// if (secim ==1).... �unu yap else if (secim ==2)... �unu yap �eklinde yap�labilir
		
		// switch sizden kontrol edebilece�i bir de�er ister
		// de�er case ile kontrol edilir
		//asla ayn� anda iki case e�it olamaz
		// NOTTT if i�inde ayn� ko�ul tekrar yaz�labilir FAKAT ilk ko�ul �al���r
				// if (secim ==1);
		//else if (secim ==1);
		// bu �ekilde yaz�labiliyor
		// break komutu (keyword) sonuc bulunduktan sonra s�sl� parantezin d���na ��kar yani
		// sistemi terk eder
		switch (secim) {
		case 1: 
				System.out.println("Toplama yap�ld�"); 
				System.out.println("yeni bir kod:");
				int sayi1 =5;
				int sayi2 = 4843;
				int toplam = sayi1 + sayi2;
				System.out.println("toplam: "+toplam);							
				break;
				
		case 2: System.out.println("��karma yap�ld�"); break;
		case 3: System.out.println("�arpma yap�ld�"); break;
		case 4: System.out.println("B�lme yap�ld�"); break;
		case 5: System.out.println("Mod yap�ld�"); break;
		case 0: System.out.println("��k�� yap�ld�"); break;
		
		default: System.out.println("L�tfen ge�erli bir se�im yap�n�z"); break;
		
		
		
		}
		
		
		
		
		
		
		
		
	
		
		
		
	} // main sonu
	

}// class sonu
