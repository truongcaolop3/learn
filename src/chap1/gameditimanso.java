package chap1;

import java.util.Scanner;

public class gameditimanso {
	public static void main(String[] args) {
		
		final int min = 1 ;
		final int max = 100;
		int ran = (max - min) + 1;
		int xuat = (int)(Math.random()* ran) + min;
	
//		System.out.println(xuat);
		
		Scanner sc = new Scanner(System.in);
//		
		int nv = 0;
		int dem = 0;
		while (xuat != nv) {
			System.out.println(" ban nhap tu (1-100: )");
			nv = sc.nextInt();
			if(nv > xuat) {
				System.out.println(" số cần tim < so ban vua nhap:");
			}else if ( nv < xuat ) {
				System.out.println("so can tim > so ban vua nhap: ");
			}else {
				System.out.println(" ding doong");
			}
			dem ++;
		}
		
		System.out.println(" so diem cua ban la " + dem);

//		one = sc.nextInt();
//		System.out.println(one);
		sc.close();
	}
}
