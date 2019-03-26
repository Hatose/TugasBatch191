package day01;

import java.util.Scanner;

public class Looping {
	//membuat object scn
	static Scanner scn;

	
	//method ada 2 
	//written value,
	//non written value void
	//method = tempat menulis logic
	//assignment variabel = menyiapkan memori
	
	 
	//method main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instansiasi
		scn = new Scanner(System.in);
		int a= 10;
		int b = 50;
		System.out.println("hasil tambah : "+ tambah(a,b) );
		System.out.println("hasil kali : "+ kali(a,b));
		System.out.println("hasil kurang : "+ kurang(a,b));
		System.out.println("hasil bagi : "+ bagi(a,b));
		
		//3 1 9 3 15 5 21 7
		scn = new Scanner(System.in);
		System.out.println("masukkan nilai n : ");
		int n = scn.nextInt();
		int c = 3; 
		int d = 1;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(c);
			System.out.println(d);
			
			c= c+6;
			d= d+2;
		}

	}
	
	static int tambah(int x, int y) {
		return x+y;
	}
	static int kali(int m, int n) {
		return m*n;
	}
	static int kurang(int x, int y) {
		return x-y;
	}
	static float bagi(float x, float y) {
		return x/y;
	}
	
	static void inputOutput() {
		//tampilkan
		System.out.println("masukkan nama");
		//variable
		String nama = scn.next();
		//tampilkan variabel
		System.out.println("Nama : "+ nama);
	}

}
