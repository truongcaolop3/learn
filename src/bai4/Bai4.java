/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai4 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r,C,D;
		final double PI = 3.14159;
		// chi vi C = 2π.r
		// c : chu vi 
		// r ban kinh
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh R = ");
		r = sc.nextDouble();
		
		C = 2 * PI * r;
		
		System.out.println("chu vi hinh tron la: " + C);
    }
    
}
