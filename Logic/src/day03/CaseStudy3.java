package day03;

import java.util.Scanner;

public class CaseStudy3 {

	static Scanner scn;
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		//input
		System.out.print("n = ");
		int n = scn.nextInt();
		System.out.print("m = ");
		int m = scn.nextInt();
		System.out.print("o = ");
		int o = scn.nextInt();
		
		//1.buat array deret
		int[] deret = new int[n*4];
		int angka = o;
		
		for (int i = 0; i < deret.length; i++) {
			if(i%4 == 3) {
				deret[i]= m;
				System.out.print(m + " ");
				
			}
			else {
				deret[i] = angka;
				angka = angka+m;
				System.out.print(deret[i]+ " ");
			}
		}
		System.out.println(" \n");
		
		//2. buat array 2 dimensi
		String[][] array = new String[n][n];
				
		//buat index  
		int index = 0;
		
		//3. isi baris ke 0 kolom i/baris pertama
		//mengisi
		for (int i = 0; i < n; i++) {
			array[0][i] = deret[index]+"";
			index++;
		}
		//baris ke n kolom n-1/kolom paling belakang
		for (int i = 1; i < n; i++) {
			array[i][n-1]=deret[index] +"";
			index++;
		}
		
		//baris ke n-2 kolom ke n/baris paling bawah
		for (int i = n-2; i >=0; i--) {
			array[n-1][i] = deret[index]+ "";
			index++;
		}
		//baris ke 0 kolom 0/kolom pertama
		for (int i = n-2; i >0; i--) {
			array[i][0] = deret[index] + "";
			index++;
		}
		
		//menampilkan array 2d
		for (int b = 0; b < array.length; b++) {
			for (int k = 0; k < array[b].length; k++) {
				System.out.print(array[b][k]+ "\t");
			}
			//pindah baris
			System.out.println("\n");
		}
	}

}
