package com.dinc;

import java.util.Scanner;

public class runner_switchcase {

	public static void main(String[] args) {

		// if vs. Switch 
		// belli aralýklar için if kullanýlýr. Switch..case kullanýlmaz
		// nokta atýþý deðer kontrolü yapmak için switch..case kullanýlýr
		// switch case ile yapýlabilen her kurgu if ile yapýlabilir.
		// tam tersi olmaz
		// iki durum içinde kullanýlan bir kurguda, switch case , if else den 
		//daha hýzlý
		
		System.out.println();
		System.out.println("*****ÝÞLEMLER*****");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. Çýkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. Mod");
		System.out.println("0. ÇIKIÞ");
		System.out.println();
		System.out.println("Seç: ");
		
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		// if (secim ==1).... þunu yap else if (secim ==2)... þunu yap þeklinde yapýlabilir
		
		// switch sizden kontrol edebileceði bir deðer ister
		// deðer case ile kontrol edilir
		//asla ayný anda iki case eþit olamaz
		// NOTTT if içinde ayný koþul tekrar yazýlabilir FAKAT ilk koþul çalýþýr
				// if (secim ==1);
		//else if (secim ==1);
		// bu þekilde yazýlabiliyor
		// break komutu (keyword) sonuc bulunduktan sonra süslü parantezin dýþýna çýkar yani
		// sistemi terk eder
		switch (secim) {
		case 1: 
				System.out.println("Toplama yapýldý"); 
				System.out.println("yeni bir kod:");
				int sayi1 =5;
				int sayi2 = 4843;
				int toplam = sayi1 + sayi2;
				System.out.println("toplam: "+toplam);							
				break;
				
		case 2: System.out.println("Çýkarma yapýldý"); break;
		case 3: System.out.println("Çarpma yapýldý"); break;
		case 4: System.out.println("Bölme yapýldý"); break;
		case 5: System.out.println("Mod yapýldý"); break;
		case 0: System.out.println("Çýkýþ yapýldý"); break;
		
		default: System.out.println("Lütfen geçerli bir seçim yapýnýz"); break;
		
		
		
		}
		
		
		
		
		
		
		
		
	
		
		
		
	} // main sonu
	

}// class sonu
