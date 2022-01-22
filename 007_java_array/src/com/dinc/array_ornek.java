package com.dinc;

import java.util.Random;
import java.util.Scanner;

public class array_ornek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("kaç adet sayý üretilecek: ");
		int adet = sc.nextInt();
		
		int[] sayi_dizisi = new int [adet];
		Random rd = new Random ();
		
		for (int i=0; i<adet;i++) {
		sayi_dizisi[i] = rd.nextInt(10000);
		System.out.println((i+1)+ ". sayý: " +sayi_dizisi[i]);
		
		}
		
		// hangisi en büyük
		int buyuk_sayi=0, kucuk_sayi=0;
		for (int i=0; i<adet; i++) {
		
			int sayi = sayi_dizisi[i];
			if (i==0) {
				buyuk_sayi =sayi;
				kucuk_sayi = sayi;
		}
			else {
		
				if(buyuk_sayi<sayi)
					buyuk_sayi=sayi;
				if(kucuk_sayi>sayi)
					kucuk_sayi=sayi;
			}
			
		}
			
		System.out.println("En büyük Sayý: " +buyuk_sayi);
		System.out.println("En küçük Sayý: " +kucuk_sayi);
		
	}// main sonu

} // class sonu
