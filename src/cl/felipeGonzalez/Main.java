package cl.felipeGonzalez;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ingrese su nombre:");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("ingrese su Apellido:");
		String apellido = sc.nextLine();
		System.out.println("ingrese su direccion:");
		String direccion = sc.nextLine();
		System.out.println("ingrese Comuna:");
		String comuna = sc.nextLine();
		System.out.println("ingrese ciudad:");
		String ciudad = sc.nextLine();
		System.out.println("ingrese codigo postal");
		int codigoPostal = sc.nextInt();
		System.out.println("ingrese numero telefonico:");
		int telefono = sc.nextInt();
		
		
		String etiqueta = String.format(
				"Nombre: %s %s\n"
				+ "Direccion: %s\n"
				+ "Comuna: %s\n"
				+ "Ciudad: %s\n"
				+ "Codigo Postal: %d\n"
				+ "Telefono: %d", 
				nombre,apellido,direccion,comuna,ciudad,codigoPostal,telefono);
		
				System.out.println("\n"+ etiqueta);

	}

}
