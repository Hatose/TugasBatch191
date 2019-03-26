package day02;

import java.util.Scanner;

public class CaseStudy2 {

	static Scanner scn;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn = new Scanner(System.in);
		
	}
	
	public static void soal1() {
		int n1 = 7;
		int n2 = 3;
		int a = 1;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		
			for (int i = 0; i < n1; i++) {
				System.out.print(i + " ");
				
			}
			
			System.out.println(" ");
			
			for (int i = 0; i < n1; i++) {
				
				if(i == 0) {
					
					count1 = count1 + a;
				}
				else if (i == 1) {
					count2 = count2 + a;
				}
				else if(i==2) {
					count3 =  count3 + a;
				}
				System.out.print(a + " ");
				a= a*n2;
			}
			count4 = count1+count2+count3;
			System.out.println(" ");
			System.out.print(count1+"+"+count2+"+"+count3+"=");
			System.out.print(count4);
			
	}
	
	public static void soal2() {
		int n1 = 7 ;
		int n2 = 3;
		int a = 1;
		int count1 = 0 ;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < n1; i++) {
			System.out.print(i+ " ");
		}
		System.out.println(" ");
		for (int i = 0; i < n1; i++) {
			if (i==0||i==1||i==4) {
				
				System.out.print(a+ " ");
			}
			else {
				a= a*-1;
				System.out.print(a + " ");
			}
			if(i==0) {
				count1 = count1 +a;
			}
			else if (i==1) {
				count2 = count2+a;
			}
			else if(i==2) {
				count3 = count3+a;
			}
			
			a = a*n2;
		}
		count4 = count1*count2*count3;
		System.out.println(" ");
		System.out.print(count1+"*"+count2+"*"+count3+"=");
		System.out.print(count4);
	}
	
	public static void soal3() {
		int n1 = 7 ;
		int n2 = 3;
		int n3 = 2;
		int count1 = 0 ;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < n1; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < n1; i++) {
			if(i==3) {
				count1 = count1 +n3;
			}
			else if (i==4) {
				count2 = count2+n3;
			}
			else if(i==5) {
				count3 = count3+n3;
			}
			if (i==0) {
				System.out.print(n3+ " ");
				n3 = n3*3;
			}
			else if(i==1||i==2) {
				System.out.print(n3 + " ");
				n3 = n3*2;
			}
			else if(i==3||i==4) {
				System.out.print(n3 + " ");
				n3 = n3/2;
			}
			else {
				System.out.print(n3 + " ");
				n3 = n3/3;
			}
		}
		count4 = count1-count2-count3;
		System.out.println(" ");
		System.out.print(count1+"-"+count2+"-"+count3+"=");
		System.out.print(count4);
	}
	
	public static void soal4() {
		int n1 = 7 ;
		int n2 = 5;
		int a = 1;
		//int[] count = new count[4];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for (int i = 0; i < n1; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < n1; i++) {
			if(i==1) {
				count1 = count1 +n2;
			}
			else if (i==3) {
				count2 = count2+n2;
			}
			else if(i==5) {
				count3 = count3+n2;
			}
			if(i==0) {
			System.out.print(a+ " ");
			a=a+1;
			}
			else if(i%2 == 0) {
				System.out.print(a + " ");
				a=a+1;
			}
			else {
				System.out.print(n2 + " ");
				n2 = n2+ 5;
			}
		}
		count4 = count1+count2+count3;
		System.out.println(" ");
		System.out.print(count1+"+"+count2+"+"+count3+"=");
		System.out.print(count4);
	}
	
	public static void soal5() {
		
		System.out.print("Input : ");
		String kata = scn.next();
		
		StringBuilder sentenceReformed = new StringBuilder();

	    for (String word : kata.split(" ")) {
	        sentenceReformed.append(replaceAll(word, '*'));
	        sentenceReformed.append(" ");
	    }
	    
		System.out.println("Output : " + sentenceReformed);
		
	}
		/*if (kata.length()%2 == 0) {
			position =kata.length() /2 - 1;
			panjang = 2;
		}
		else {
			position = kata.length() /2;
			panjang = 1;
		}*/
		
		/*for (String word : kata.split(" ")) {
			if(word == "A" || word == "S" || word == "u" || word == "g" || word == "K" || word == "u") {
				System.out.print(word);
			}
			else if(kata == "k" || kata == "a" || kata == "m" || kata == "y" || kata =="n") {
				System.out.println("*");
				}
		}*/
	
	public static void soal6() {
		System.out.print("Input : ");
		String kata = scn.next();
		int uppercase = 0;
		
		for (int i = 0; i < kata.length(); i++) {
			if(Character.isUpperCase(kata.charAt(i))) {
				uppercase++;
			}
		}
		System.out.print("Output : " + uppercase);
	}
	
	
	
	
	
	public static String replaceAll(String word, char replacer) {
	    StringBuilder ret = new StringBuilder();
	    if (word.length()>2) {
	        ret.append(word.charAt(0));
	        for (int i = 1; i < word.length() - 1; i++) {
	            ret.append(replacer);
	        }
	        ret.append(word.charAt(word.length() - 1));
	        return ret.toString();
	    }

	    return word;
	}
	
	public static String middle (String kata) {
		int position;
		int panjang;
		if (kata.length()%2 == 0) {
			position =kata.length() /2 - 1;
			panjang = 2;
		}
		else {
			position = kata.length() /2;
			panjang = 1;
		}
		return kata.substring(position, position + panjang);
	}
	
	public static String start (String kata) {
		int position;
		int panjang;
		position = kata.length();
		if (kata.length()%2 == 0) {
			position =kata.length() /2 - 1;
			panjang = 2;
		}
		else {
			position = kata.length() /2;
			panjang = 1;
		}
		return kata.substring(position, position + panjang);
	}
	
	public static void soal1v2() {
		System.out.print("n1 : ");
		int n1 = scn.nextInt();
		System.out.print("n2 : ");
		int n2= scn.nextInt();
		int a = 1;
		int count1 = 0 ;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for (int i = 0; i < n1; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < n1; i++) {
			if(i == 0) {
				
				count1 = count1 + a;
			}
			else if (i == 1) {
				count2 = count2 + a;
			}
			else if(i==2) {
				count3 =  count3 + a;
			}
			System.out.print(a + " ");
			a= a*n2;
		}
		count4 = count1+count2+count3;
		System.out.println(" ");
		System.out.print(count1+"+"+count2+"+"+count3+"=");
		System.out.print(count4);
	}
	
	public static void soal6v2(String word) {
		String[] split = word.split(" ");
		
		for (int i = 0; i < word.length(); i++) {
			String data = "";
			for (int j = 0; j < split[0].length(); j++) {
				if(i==0 ) {
					data += split[0].charAt(i);
				}
				else {
					data+="*";
				}
			}
		}

	}

}
