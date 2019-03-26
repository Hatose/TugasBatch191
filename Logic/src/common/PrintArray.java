package common;

public class PrintArray {
	public static void array2D(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	//overloading=> nama method sama parameter beda

}
