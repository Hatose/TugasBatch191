package day03;

import java.util.Scanner;

public class CaseStudy2 {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soal5v2();

	}
	
	public static void soal5(){
		scn  = new Scanner(System.in);
		System.out.print("input : ");
		String text = scn.nextLine();//input
		System.out.print("Output : ");//output : 
		
		String[] array = text.split(" ");//split text to word
		//kalimat jadi kata
		
		//looping seluruh panjang kata
		for (int i = 0; i < array.length; i++) {
			
			String[] item = array[i].split("");//split word to character
			//kata jadi huruf
			
			//loop check every word
			for (int j = 0; j < item.length; j++) {
				//check if word is not start or end
				if (j>0 && j<item.length-1) {
					//if word is not start or end print *
					System.out.print("*");
				} 
				else {// if word is start or end print word
					System.out.print(item[j]);
				}
			}
			System.out.print(" ");
		}
	}
	
	public static void soal5v2() {
		scn = new Scanner(System.in);
		System.out.print("Input : ");
		String text = scn.nextLine();
		System.out.print("Output : ");
		String[] array = text.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			String[] item = array[i].split("");
			
			for (int j = 0; j < item.length; j++) {
				if(j>0 && j<item.length-1) {
					System.out.println("*");
				}
				else if(j==0 ||j==item.length) {
					System.out.println(item[j]);
				}
			}
			System.out.println(" ");
		}
		
		
	}

}
