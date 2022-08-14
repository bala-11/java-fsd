package typeCasting;


public class typeCasting {

	public static void main(String[] args) {
		//implicit typecasting
		//small2big
		char c = 'M';
		int a = (char) c;
		System.out.println(a);
		
		//explicit typecasting
		//big2small
		int C = 90;
		char A = (char) C;
		System.out.println(A);
	}

}
