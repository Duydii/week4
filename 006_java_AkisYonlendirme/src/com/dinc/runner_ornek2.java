package com.dinc;

import java.util.Scanner;

public class runner_ornek2 {

	public static void main(String[] args) {

		int s1, s2, s3;
		// �eklinde 3 say� olsun
		// say�lar� kullan�c�dan girdi olarak alal�m
		Scanner sc = new Scanner (System.in);
		System.out.println("1. say�y� giriniz: ");
		s1 = sc.nextInt();
		System.out.println("2. say�y� giriniz: ");
		s2 = sc.nextInt();
		System.out.println("3. say�y� giriniz: ");
		s3 = sc.nextInt();
		
		// Bu say�lardan en b�y�k ve en k����� bulan kodu yaz
		
		int buyuk_sayi, kucuk_sayi;
		
		if (s1>s2 && s1>s3) buyuk_sayi =s1;
		else if (s2>s1 && s2>s3) buyuk_sayi=s2;
		else buyuk_sayi=s3;
			
		if (s1<s2 && s1<s3) kucuk_sayi =s1;
		else if (s2<s1 && s2<s3) kucuk_sayi=s2;
		else kucuk_sayi=s3;

		System.out.println("b�y�k say�: "+buyuk_sayi);
		System.out.println("k���k say�: "+kucuk_sayi);
		
	} // main sonu

} // class sonu
