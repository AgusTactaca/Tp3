package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		ArrayList<String> almacen = new ArrayList();
		int x;
		int y;
		do {
			System.out.println("Ingrese nombres de frutas");
			Scanner sc = new Scanner(System.in);
			String nombreFruta = sc.nextLine();
			almacen.add(nombreFruta);
			System.out.println("Desea ingresar mas datos? (S/N)");
			x = sc.nextInt();
		}while( x == 1);
		System.out.println(almacen.size());
		System.out.println(almacen.get(2));
		
		  for (int i = 0; i < almacen.size(); i = i + 1) { 
			  y = almacen.size() - i; 
			  if ((y % 2) == 0) { 
				  System.out.println(almacen.get(y)); 
				  } 
			  }
		 
	}
}
