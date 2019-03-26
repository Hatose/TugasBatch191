package day03;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = new int[5][3];
		int angka = 1;
		//mengisi
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = angka;
				angka+=3;
			}
		}
		//menampilkan
		for (int b = 0; b < array1.length; b++) {
			for (int k = 0; k < array1[b].length; k++) {
				System.out.print(array1[b][k]+ "\t");
			}
			//pindah baris
			System.out.println("\n");
		}
		int[][] array2 = new int[3][5];
		System.out.println("test");
	}
	
	public static void contoh2d() {
		int[][] array1 = new int[5][3];
		//mengisi
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j]=i;
			}
		}
		//menampilkan
		for (int b = 0; b < array1.length; b++) {
			for (int k = 0; k < array1[b].length; k++) {
				System.out.print(array1[b][k] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void contoh2dv2() {
		int[][] array1=new int [5][3];
	}

}
