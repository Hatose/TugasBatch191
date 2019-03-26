package day03;

import java.util.Scanner;

public class ArraySample {
	static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contoharray2();
	}
	
	public static void contoharray() {
		scn = new Scanner(System.in);
		System.out.print("masukan nilai n : ");
		int n = scn.nextInt();
		int array[] = new int [n];
		int a= 3;
		int b = 1;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				array[i]= a;
				a=a+6;
			}
			else {
				array[i] = b;
				b=b+2;
			}
			System.out.print(array[i] + " ");
		}
	}
	
	
	
	public static void contoharray2() {
		scn = new Scanner(System.in);
		System.out.print("Masukan nilai n : ");
		int n = scn.nextInt();
		int array[] = new int[n];
		int a= 3;
		int b = 1;
		
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				array[i]=a;
				a=a+6;
				
			}
			else {
				array[i]=b;
				b=b+2;
			}
			System.out.println(array[i]+" ");
		}
	}
	
	
	
	
	
	public static void taro() {
		scn = new Scanner(System.in);
		
		System.out.print("Masukkan nilai n : ");
		int n = scn.nextInt();
		
		//3  1  9  3  5  15 => n=6
		
		int[] array = new int[n];
		int a = 3;
		int b =1;
		for (int i = 0; i < array.length; i++) {
			
			
			if(i%2 == 0) {
				array[i]=a;
				a = a +6;
			}
			else {
				array[i] = b;
				b = b +2;
			}

			System.out.print(array[i] + " ");
			
		}
	}

}
