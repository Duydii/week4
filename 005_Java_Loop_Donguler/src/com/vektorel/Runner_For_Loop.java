package com.vektorel;

public class Runner_For_Loop {

	public static void main(String[] args) {
		
		//index in k�saltmas� i
		// !!! L�tfen FOR d�n�g�s� sonunda s�sl� parantezin �n�ne ; koymay�n�z
		//�rnek: for(int i=0;i<40;i++);{} 
		for(int i=0;i<5;i++) {
			// bu iki s�sl� parantez aras� for d�ng�s�n�n g�vdesidir
			//d�ng�ye sokulacak kodlar buraya yaz�l�r
			System.out.println(i+". Din� �ZMEN");
			System.out.println("bunu da yaz");
		}
		
		// For Loop da syntax g�vdesiz kullan�n
		// For d�ng�s�nde g�vde eklenmemi� ise yani s�sl� parantez yoksa sonraki ; e kadarki
		//ilk kod blo�u d�ng�ye girer
		for (int i=0;i<5;i++)
			System.out.println("2 For Loop G�vdesiz");
			System.out.println("bunu yazacak m�");
		
		System.out.println("Program Sonland�");

		
		
	}

}
