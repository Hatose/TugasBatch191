package day01;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soal5();

	}
	
	public static void soal1() {
		//1 3 5 7 9 11 13
		int n = 7;
		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a+" ");
			a=a+2;
		}
	}
	
	public static void soal2() {
		//2 4 6 8 10 12 14
		int n = 7;
		int a = 2;
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			a=a+2;
		}
	}
	
	public static void soal3() {
		//1 4 7 10 13 16 19
		int n = 7;
		int a= 1;
		for (int i = 0; i<n; i++) {
			System.out.println(a);
			a=a+3;
		}
	}
	
	public static void soal4() {
		int n = 7;
		int a = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a);
			a=a+3;
		}
	}
	public static void soal5() {
		int n =7;
		int a=1;
		
		for (int i = 0; i < n; i++) {
			if (i==2 || i==5) {
			System.out.print("* ");
			
			}
			else if (i!=2 || i!=5){
			System.out.print(a+ " ");
			a=a+4;
			}
		}
		
	}
	public static void soal6() {
		int n = 7;
		int a=1;
		for (int i = 0; i < n; i++) {
			if(i==2|| i==5) {
				System.out.print("* ");
				a=a+4;
			}
			else if(i!=2 || i!=5) {
				System.out.print(a+" ");
				a=a+4;
			}
		}
	}
	public static void soal7() {
		int n = 7;
		int a = 2;
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			a=a*2;
		}
	}
	public static void soal8() {
		int n = 7;
		int a= 3;
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			a=a*3;
		}
	}
	public static void soal9(){
		int n = 7;
		int a=4;
		for (int i = 0; i < n; i++) {
		if(i==2 || i==5) {
			System.out.print("* ");
		}
		else if(i!=2 || i!=5) {
			System.out.print(a + " ");
			a=a*4;	
		}
		}
	}
	public static void soal10() {
		int n = 7;
		int a = 3;
		for (int i = 0; i < n; i++) {
			if(i==3) {
				System.out.print("xxx ");
			}
			else if (i!=3) {
			System.out.print(a+ " ");
			}
			a=a*3;
		}
	}

}
