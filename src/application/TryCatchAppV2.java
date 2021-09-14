package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchAppV2 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("IS ALL OVER");

	}
	public static void method1() {
		System.out.println("**********Inicio***********");
		method2();
		System.out.println("**********FIM***********");
	}
	
	public static void method2() {
		System.out.println("**********Inicio Metodo 2***********");
		Scanner sc = new Scanner (System.in);
		try {
			String [] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position! " + e.getMessage());
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println(e + " é geometria pra usar letra nessa porra?");
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("**********Fim Metodo 2***********");
	}

}
