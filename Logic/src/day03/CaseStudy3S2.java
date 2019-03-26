package day03;

import java.util.Scanner;

public class CaseStudy3S2 {
	static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn = new Scanner(System.in);
		//input
		System.out.print("n = ");
		int n = scn.nextInt();
		System.out.print("m = ");
		int m = scn.nextInt();
		System.out.print("o = ");
		int o = scn.nextInt();
		
		int[] deret = new int[n*4];
		int angka =o;
		
		//buat array deret
		for (int i = 0; i < deret.length; i++) {
			if(i%4 == 3) {
				deret[i] = m;
				System.out.print(deret[i] +" ");
			}
			else {
				deret[i] = angka;
				angka = angka+m;
				System.out.print(deret[i]+" ");
			}
		}
		System.out.println("\n");
		
		//buat array 2 dimensi
		String[][] array = new String[n][n];
		
		//buat index
		int index=0;
		
		//mengisi array
		//diagonal = dari baris 0->baris n
		for (int i = 0; i <n; i++) {
			array[(n-1)-i][i]=deret[index] + "";
			index++;
		}
		//kanan atas ke kiri
		for (int i = n-2; i >=0; i--) {
			array[0][i] = deret[index]+"";
			index++;
		}
		//kiri atas ke bawah
		for (int i = 1; i < n-1; i++) {
			array[i][0] = deret[index]+"";
			index++;
		}
		
		
		
		
		//menampilkan arrray
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+ "\t ");
			}
			//pindah baris
			System.out.println("\n");
		}

	}

}
