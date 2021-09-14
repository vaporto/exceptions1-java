package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			String [] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position! " + e);
		}
		catch(InputMismatchException e) {
			System.out.println(e + " � geometria pra usar letra nessa porra?");
		}
		System.out.println("IS ALL OVER");
		sc.close();

	}

}
