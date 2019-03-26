package day01;

public class HelloWorld {
	
	private static int batch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java");
		//panggil method
		MakananFavorit();
		SampleObject();
		
	}
	
	public static void MakananFavorit() {
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Indomie");
		System.out.println("3. Dim Sum");
		System.out.println("4. Nasi Kare");
		System.out.println("5. Ramen");
		System.out.println(" ");
	}
	
	public static void SampleObject() {
		Orang or01 = new Orang();
		
		//Orang() = Constructor
		//new= orang = instansiansi
		//instansiansi:  proses pembuatan object
		//enkapsulasi=proses pembuatan class/proses pembungkusan properti dan method
		//yg dibungkus properti dan method
		
		or01.nama="Via";
		or01.alamat="Magelang";
		or01.jk="Wanita";
		or01.tptlahir="Lampung";
		or01.umur=23;
		or01.cetak();
		
		Orang or02 = new Orang();
		or02.nama="Siti";
		or02.alamat="Magelang";
		or02.jk="Wanita";
		or02.tptlahir="Lampung";
		or02.umur=22;
		or02.cetak();
		
		Orang or03 = new Orang();
		or03.nama="Siti";
		or03.alamat="Magelang";
		or03.jk="Wanita";
		or03.tptlahir="Lampung";
		or03.umur=22;
		or03.cetak();
		
		Orang or04 = new Orang();
		or04.nama="Siti";
		or04.alamat="Magelang";
		or04.jk="Wanita";
		or04.tptlahir="Lampung";
		or04.umur=22;
		or04.cetak();
		
		Orang or05 = new Orang();
		or05.nama="Siti";
		or05.alamat="Magelang";
		or05.jk="Wanita";
		or05.tptlahir="Lampung";
		or05.umur=22;
		or05.cetak();
		
		
		
		String nama1= "Tomo";
		String alamat1="Tangerang";
		String jk1 = "Pria";
		String tptlahir1="Jakarta";
		int umur1= 23;
		
		String nama2= "Tomo";
		String alamat2="Tangerang";
		String jk2 = "Pria";
		String tptlahir2="Jakarta";
		int umur2= 23;
		
		
		
		
	}

}
