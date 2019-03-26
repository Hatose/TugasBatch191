package day03;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//index nya dari 0-9
		int[] array = new int[10];
		//contoh cara isi array tiap index
		// mengisi value element array
		// [i] => element
		array[0]=1;
		array[1]=55;
		array[2]=11;
		array[3]=242;
		array[4]=22;
		array[5]=222;
		array[6]=252;
		array[7]=220;
		array[8]=252;
		array[9]=292;
		
		//System.out.println(array.length);//print jumlah array
		
		//biasanya butuh instansiasi
		//new =>instansiasi
		
		/*for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + );//print array ke index i
		}*/
		
		
		//cara kedua
		int[] array2 = new int[] {1,2,3,4,5};
		array2[0] = 13;
		array2[1] = 22;
		array2[2] = 107;
		array2[3] = 120;
		array2[4] = 100;
		
		System.out.println(array2.length);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// 3 1 9  3 5 15 => n=6
		
		
	}

}
