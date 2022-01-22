package com.dinc;

import java.util.Scanner;

public class runner_if {

	public static void main(String[] args) {
		// parantezin içi doðru ise yap
		// if in gövdesinde olan komutlarý iþlet
		
		String ad = "admin";
		String sifre = "1234";
				
		if (true) {
			
		System.out.println("Koþul doðru");	
		}
		
		if (false) {
		System.out.println("Koþul yanlýþ");	
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanýcý adi....: ");
		String k_ad = sc.nextLine();
		System.out.println("Kullanýcý sifresi....:");
		String k_sifre = sc.nextLine();
		
		// Mevcut kullanýcý adý ve þifresi ile kullanýcýnýn girmiþ olduðu
		// bilgilerin doðruluðu kontrol edilir
		
		if (ad.equals(k_ad) && sifre.equals(k_sifre)) {
					
		System.out.println("Giriþ yapýldý....");
		
		
			
		} else {
			System.out.println("Kullanýcý adý ya da þifre hatalý");
		}
				
		
		
		System.out.println("Uygulama bitti");
	}// main sonu

}// class sonu
