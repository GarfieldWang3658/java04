public class TernaryOperatorExercise{
	public static void main(String[] args){

		int n1 = 553;
		int n2 = 33;
		int n3 = 123;

		//思路
		//先求出n1和n2 中最大的数，保存到max1
		//然后再求出max1和n3的最大数保存到max2


		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;

		System.out.println("最大数="+max2);
//推荐使用一条语句使用
		//提示后面可以使用跟好的方法，比如排序
		int max = (n1 > n2? n1 : n2)> n3? (n1>n2?n1:n2):n3;

System.out.println("最大数="+ max );







	}
}