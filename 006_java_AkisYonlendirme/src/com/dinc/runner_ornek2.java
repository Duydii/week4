package com.dinc;

import java.util.Scanner;

public class runner_ornek2 {

	public static void main(String[] args) {

		int s1, s2, s3;
		// şeklinde 3 sayı olsun
		// sayıları kullanıcıdan girdi olarak alalım
		Scanner sc = new Scanner (System.in);
		System.out.println("1. sayıyı giriniz: ");
		s1 = sc.nextInt();
		System.out.println("2. sayıyı giriniz: ");
		s2 = sc.nextInt();
		System.out.println("3. sayıyı giriniz: ");
		s3 = sc.nextInt();
		
		// Bu sayılardan en büyük ve en küçüğü bulan kodu yaz
		
		int buyuk_sayi, kucuk_sayi;
		
		if (s1>s2 && s1>s3) buyuk_sayi =s1;
		else if (s2>s1 && s2>s3) buyuk_sayi=s2;
		else buyuk_sayi=s3;
			
		if (s1<s2 && s1<s3) kucuk_sayi =s1;
		else if (s2<s1 && s2<s3) kucuk_sayi=s2;
		else kucuk_sayi=s3;

		System.out.println("büyük sayı: "+buyuk_sayi);
		System.out.println("küçük sayı: "+kucuk_sayi);
		
	} // main sonu

} // class sonu
