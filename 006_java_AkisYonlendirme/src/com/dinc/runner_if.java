package com.dinc;

import java.util.Scanner;

public class runner_if {

	public static void main(String[] args) {
		// parantezin i�i do�ru ise yap
		// if in g�vdesinde olan komutlar� i�let
		
		String ad = "admin";
		String sifre = "1234";
				
		if (true) {
			
		System.out.println("Ko�ul do�ru");	
		}
		
		if (false) {
		System.out.println("Ko�ul yanl��");	
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullan�c� adi....: ");
		String k_ad = sc.nextLine();
		System.out.println("Kullan�c� sifresi....:");
		String k_sifre = sc.nextLine();
		
		// Mevcut kullan�c� ad� ve �ifresi ile kullan�c�n�n girmi� oldu�u
		// bilgilerin do�rulu�u kontrol edilir
		
		if (ad.equals(k_ad) && sifre.equals(k_sifre)) {
					
		System.out.println("Giri� yap�ld�....");
		
		
			
		} else {
			System.out.println("Kullan�c� ad� ya da �ifre hatal�");
		}
				
		
		
		System.out.println("Uygulama bitti");
	}// main sonu

}// class sonu
