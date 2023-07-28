public class LogicOperator03{
	public static void main(String[] arges){
		int x = 5;
		int y = 5;
		// if(x++==6 & ++y==6){
		// 	x = 11;
		// }
		// System.out.println("x="+x+"y="+y);

		// if (x++==6&&++y==6) {
		// // 	x = 11;
		// }
		// System.out.println("x="+x+"y="+y);

		// if (x++==5|++y==5) {
		// 	x = 11;
			
		// }
		// System.out.println("x="+x+"y="+y);

		if (x++==5||++y==5) {
			x = 11;
			
		}
		System.out.println("x="+x+"y="+y);



	}
}
