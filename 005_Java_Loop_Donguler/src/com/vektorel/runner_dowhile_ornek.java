package com.vektorel;

import java.util.Random;
import java.util.Scanner;

public class runner_dowhile_ornek {

	public static void main(String[] args) {

		//0-8 aras�nda say� tahmin oyunu
		// Bu rastgele bir sistem ile say� �retmek i�in kullan�lan yap�d�r
		Random rd = new Random ();
		int sayi = rd.nextInt(8);
		Scanner sc = new Scanner(System.in);
		boolean buldunmu;
		int tahminsayisi=0;
		do {
			System.out.println("Tahmininizi giriniz..: ");
			int tahmin = sc.nextInt();
			buldunmu = sayi == tahmin;
			tahminsayisi++;
						
		}while(!buldunmu); // ! de�illemek gerekli
		
		System.out.println("Aferin " +tahminsayisi+".tahminde buldun");
	}

}
