package ejercicio;

import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		auto auto1 = new auto(null, null, null, 0 );
		System.out.println("ingresa la matricula: ");
			auto1.setMatricula(scanner.nextLine());
			
		System.out.println("ingresa la marca: ");
			auto1.setMarca(scanner.nextLine());
			
			System.out.println("ingresa el modelo del auto:");
			auto1.setModelo(scanner.nextLine());
			
		System.out.println("ingresa la cantidad de ventanas: en numeros");
			auto1.setVentanas(scanner.nextInt());	
			
			
	
		
		
		System.out.println("-la matricula es: " + auto1.getMatricula()+" -la marca es: "+  auto1.getMarca() + " -el modelo del auto es: "+auto1.getModelo() +" el numero de ventanas es: " + auto1.getVentanas());
	}} 

	
