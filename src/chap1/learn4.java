package chap1;


public class learn4 {
	public static void main(String[] args) {
		
		for ( int i = 2; i<=9;i++) {
			System.out.println("bảng cửu chương " + i);
			
			for (int j = 1;j<=10;j++) {
				System.out.printf(" %d x %d = %d %n ", i , j , i * j );
			}
			System.out.println("----------------");
		}
		
	}
	// cửu chương đơn giản 
	public static void main2(String[] args) {
		int one = 4;
		// for
		for (int i = 1; i <= 10 ; i++) {
//			System.out.println(one + " x " + i + " = " + one * i );
//			System.out.printf(" %d x %d = %d %n ", one , i , one * i );
		}
		int j = 1;
		while (j<=10) {
//			System.out.printf(" %d x %d = %d %n ", one , j , one * j );
			j++;
		}
		int k=1;
		do {
			System.out.printf(" %d x %d = %d %n ", one , k , one * k );
			k++;
		} while (k<=10);
	}
	// vòng lặp 
	public static void main1(String[] args) {
		int one = 10;
		
		for (int i = 0; i < one; i++) {
			System.out.println(i + " JAVA is not difficult");
		}
		int j = 1;
		while (j<=10) {
			System.out.println(j + " a iu e");
		j++;
		}
//		int k= 1;
//		do {
//			System.out.print(k + " t iu m ");
//		} while (k<100);
	}
}
