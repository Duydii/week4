package com.vektorel;

import java.util.Scanner;

public class runner_for_loop_ornek1 {

	public static void main(String[] args) {

		//1- 20 ile 100 aras�ndaki say�lar�ekrana yazd�ran program
		
		for (int i=20;i<100;i++) {
			
			System.out.println(i);
		}
		
		//2- 40 ile 18 aras�ndaki say�lar� azalarak yazd�ran program
		// ko�ul ifadelerinde ko�ulu KEND�N�ZE sorun do�ru ise devam et!!!
		for (int i=40;i>18;i--) {
			
			System.out.println(i);
		}
		
		//3- 100 ile 200 aras�ndaki5  in kat� olansay�lar� listele
		
		for (int i = 100; i <=200; i+=5) {
			
			System.out.println(i);
			
		}
		
		//4- 1 ile 40 aras�ndaki teksay�lar�
		
		for (int i = 1; i < 40; i+=2) {
			
			System.out.println(i);
		}
	
		// 5- 1 ile 50 aras�ndaki �ift say�lar�n toplam�
		int toplam = 0;
		for (int i = 0; i <= 50; i+=2) {
			toplam +=i;
			
			
		}
		System.out.println("toplam..: "+toplam);
	
		
		// kullan�c�dan ald���n�z de�erin fakt�riyel hesaplamas�n� bulunuz.
		
		System.out.println("bir sayi giriniz..: ");
		Scanner sc = new Scanner(System.in); 
		int sayi = sc.nextInt();
		int faktoriyel=1;
		//5! 5*4*3*2*1
		
		for (int i = sayi; i > 1; i--) {
			faktoriyel *=i;
			
		}
		
		 System.out.println("Fakt�riyel : " +faktoriyel);

		
		
		}
	}


