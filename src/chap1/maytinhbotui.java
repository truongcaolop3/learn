package chap1;

import java.util.Scanner;

public class maytinhbotui {
	public static void main(String[] args) {
		
		int one ;
		int two ;
		int tv = 0;
		String pt;
		
		Scanner sc = new Scanner(System.in);
		// one 
		System.out.println("one: ");
		one = sc.nextInt();
		sc.nextLine();
		// two
		System.out.println("two: ");
		two = sc.nextInt();
		sc.nextLine();
		// pt
		System.out.println("pt: ");
		pt = sc.nextLine();
		
//		sc.close();
		System.out.println("one = " + one );
		System.out.println("two = " + two );
		System.out.println("pt = " + pt );
		
		// + - (* x) (/ :) %
		
		switch (pt) {
			case "+":
				tv = one + two;
				break;
			case "-":
				tv = one - two;
				break;
			case "x":
			case "*":
				tv = one * two;
				break;
			case ":":
			case "/":
				tv = one / two;
				break;
			case "%":
				tv = one % two;
				break;
				
			default:
				System.out.println(" vui long nhap cac phep tinh nhu + - x /");
				break;
		}
		System.out.println("tra ve: " );
		System.out.printf("%d %s %d = %d", one ,pt , two ,tv);
	}
}
