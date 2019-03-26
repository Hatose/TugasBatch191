package day01;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 10;
		if(x/5==2) {
			System.out.println("x/5 == 2");
		} else if(x* 2==20) {
			System.out.println("x * 2 == 20");
		} else if(x%2==0) {
			System.out.println("x%2 == 0");
		}else if(x/5== x % 4) {
			System.out.println("x/5== x % 4");
		}else {
			System.out.println("else");
		}
		//%atau modulus sisa hasil bagi
		//

	}

}
