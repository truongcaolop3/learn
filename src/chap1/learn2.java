package chap1;

public class learn2 {
	public static void main(String[] args) {
		int max = 100;
		int min = 10;
		int range = (max - min) + 1;
		
		System.out.println((int)(Math.random() * range) + min ) ;
	}
	public static void main7(String[] args) {
		int one = 1;
		int two = 182;
		int three = 517;
		
//		int maxnumber = Math.max(one, two);
//		int haha = Math.max(maxnumber, three);
		int haha = Math.max(Math.max(one, two), three);
		System.out.println(haha);
	}
	//hàm toán học: max min ceil floor round ...
	public static void main6(String[] args) {
		int one = 20;
		int two = 12;
		double three = 123.162;
		
		int maxnumber = Math.max(one, two);
		System.out.println("max = " +maxnumber);
		
		int minnumber = Math.min(one, two);
		System.out.println("min = " + minnumber);
		
		
		System.out.println("ceil = " + Math.ceil(three) );
		System.out.println("floor = " + Math.floor(three));
		System.out.println("round = " + Math.round(three));
		
		double random = Math.random();
		System.out.println("random = " + random);
	}
	//toán tử logic && || !
	public static void main5(String[] args) {
		int one = 20;
		int two = 10;
		boolean result = false;
		
		result = (one > two) && (one >= two);
		System.out.println("(one > two ) && (one >= two is: " + result);
		
		result = (one > two) || (one >= two);
		System.out.println("(one > two ) || (one >= two is: " + result);
	
		result = !(one > two);
		System.out.println("(one > two ) is: " + result);

	}
	// toán tử so sánh > < >= <= !=
	public static void main4(String[] args) {
		int one = 20;
		int two = 30;
		boolean result = true;
		
		result = one > two;
		System.out.println(one + " > " + two + " is " + result);

		result = one >= two;
		System.out.println(one + " >= " + two + " is " + result);

		result = one < two;
		System.out.println(one + " < " + two + " is " + result);

		result = one <= two;
		System.out.println(one + " <= " + two + " is " + result);

		
		result = one == two;
		System.out.println(one + " == " + two + " is " + result);

		result = one != two;
		System.out.println(one + " != " + two + " is " + result);

	}
	// toán tử ++ --
	public static void main3(String[] args) {
		int start = 16;
		int end = 0;
		
//		end = start--;
//		end = start++;
//		end = ++start;
//		end = --start;
		System.out.println("start = " + start);
		System.out.println("end = " + end);
	}
	// toán tử gán += -+ *= ?= %=
	public static void main2(String[] args) {
		int so = 20;
		
		System.out.println("strar = " + so);
		
		so = so + 10;
		System.out.println("end = " + so);
	}
	// toán thử số học + - * / % ....
	public static void main1(String[] args) {
		int one = 20;
		int two = 4;
		int result;
		
		// + 
		result = one + two ;
		System.out.println(one + " + " + two + " = " + result);

		// -
		result = one - two ;
		System.out.println(one + " - " + two + " = " + result);
		
		// *
		result = one * two ;
		System.out.println(one + " * " + two + " = " + result);
		
		// /
		result = one / two ;	
		System.out.println(one + " / " + two + " = " + result);

		// %
		result = one % two ;
		System.out.println(one + " % " + two + " = " + result);
		
		
	}
}
