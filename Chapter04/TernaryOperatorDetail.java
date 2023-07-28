public class TernaryOperatorDetail{

	public static void main(String[] args){

		int a =3;
		int b =8;
		int c =a > b ?  a : b;

		int c =a > b ? (int)1.1:(int)3.4;//可以

		double d = a > b ? a : b + 3;
	}

}