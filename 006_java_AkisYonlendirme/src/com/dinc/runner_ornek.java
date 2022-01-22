package com.dinc;

import java.util.Scanner;

public class runner_ornek {

	public static void main(String[] args) {
		
		// 1-5 arasýnda sayý talep edeceksiniz
		// kullanýcý bu aralýkta sayý girmedikçe tekrar giriþ talep edilecek
		// girilen deðere göre iþlem yapýlacak
		// 1-toplama, 2-çýkarma, 3- çarpma, 4- bölme,5-çýkýþ
		
		System.out.println();
		System.out.println("*****ÝÞLEMLER*****");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. Çýkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. ÇIKIÞ");
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		int secim;
		
		do {
			System.out.println("Seç: ");
			secim = sc.nextInt();
			
			// parantez içi doðru ise döngü devam eder
			// 1,2 3,4,5 girilirse döngüden çýkacak. yani döngü sona erecek
		}while (secim<1 || secim>5);
		
		switch (secim) {
		
		case 1: 
			int s1, s2, toplam;
			System.out.println("Toplama için 1. sayý. ");
			s1 = sc.nextInt();
			System.out.println("Toplama için 2. sayý. ");
			s2 = sc.nextInt();
			toplam = s1+s2;
			System.out.println("TOPLAM: " +toplam);
			break;			
		case 2: System.out.println("Çýkart"); break;
		case 3: System.out.println("Çarp"); break;
		case 4: System.out.println("Böl"); break;
		default: System.out.println("Program sonu");
		}
		
		System.out.println("döngüden çýktý");
		
		
		
		
		/*if (secim>=0 && secim<=5) {
		switch (secim) {
		
		case 1: System.out.println("Topla"); break;
		case 2: System.out.println("Çýkar"); break;
		case 3: System.out.println("Çarp"); break;
		case 4: System.out.println("Böl"); break;
		case 5: System.out.println("ÇIKIÞ YAP"); break;
		}
		
		} else {
		 System.out.println("Tekrar giriþ yapýnýz");
				 
		}
		*/
		
				
		
		
	}// main sonu

}// class sonu
