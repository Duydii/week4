package com.dinc;

import java.util.Scanner;

public class runner_ornek {

	public static void main(String[] args) {
		
		// 1-5 aras�nda say� talep edeceksiniz
		// kullan�c� bu aral�kta say� girmedik�e tekrar giri� talep edilecek
		// girilen de�ere g�re i�lem yap�lacak
		// 1-toplama, 2-��karma, 3- �arpma, 4- b�lme,5-��k��
		
		System.out.println();
		System.out.println("*****��LEMLER*****");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. ��karma");
		System.out.println("3. �arpma");
		System.out.println("4. B�lme");
		System.out.println("5. �IKI�");
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		int secim;
		
		do {
			System.out.println("Se�: ");
			secim = sc.nextInt();
			
			// parantez i�i do�ru ise d�ng� devam eder
			// 1,2 3,4,5 girilirse d�ng�den ��kacak. yani d�ng� sona erecek
		}while (secim<1 || secim>5);
		
		switch (secim) {
		
		case 1: 
			int s1, s2, toplam;
			System.out.println("Toplama i�in 1. say�. ");
			s1 = sc.nextInt();
			System.out.println("Toplama i�in 2. say�. ");
			s2 = sc.nextInt();
			toplam = s1+s2;
			System.out.println("TOPLAM: " +toplam);
			break;			
		case 2: System.out.println("��kart"); break;
		case 3: System.out.println("�arp"); break;
		case 4: System.out.println("B�l"); break;
		default: System.out.println("Program sonu");
		}
		
		System.out.println("d�ng�den ��kt�");
		
		
		
		
		/*if (secim>=0 && secim<=5) {
		switch (secim) {
		
		case 1: System.out.println("Topla"); break;
		case 2: System.out.println("��kar"); break;
		case 3: System.out.println("�arp"); break;
		case 4: System.out.println("B�l"); break;
		case 5: System.out.println("�IKI� YAP"); break;
		}
		
		} else {
		 System.out.println("Tekrar giri� yap�n�z");
				 
		}
		*/
		
				
		
		
	}// main sonu

}// class sonu
