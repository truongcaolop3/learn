package chap1;

public class learn1 {
	
	public static void main(String[] args) {
		int var1 = 20;
		double var2 = 1.23;
		int var3 = var1 + (int)var2;
		double var4 = (double)var1 + var2;
		System.out.println("var3 ="  + var3);
		System.out.println("var4 = " + var4);
//		main1();
//		main2();
//		main3();
	}
	 //data type
	public static void main3() {
		int var1 = 12;
		int var2 = 129;
		boolean var3 = true;
		double var4 = 123.456;  //john Smith;
		String name =  "john Smiththgt";
		
		System.out.println("var1"  + var1);
		System.out.println("var2"  + var2);
		System.out.println("var3"  + var3);
		System.out.println("var4"  + var4);
		System.out.println("name"  + name);
	}
	//contact
	public static void main2() {
		final int YOUR_BIRTHDAY = 2002;
		System.out.println(YOUR_BIRTHDAY);
	}
	//viralable
	public static void main1() {
		//khai bao bien
//		int age,year;
//		char name,city;

		char firstname; //nomal
//		char firstName;	//camelCase
//		char first_name;	//underscores
//		char first-name; //hyphen
		int age = 20;
		int year = 2020;
		char name = 'n';
		System.out.println(age  + age);
		age = 30;
		System.out.println(age  + age);
		System.out.println(year);
		System.out.println(name + name);
	}
}
