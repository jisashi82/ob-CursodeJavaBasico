package io.codemalone33.tema789;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicios {

	public static void main(String[] args) {

		boolean ok = false;
		do {
			// limpiarPantalla();
			try {
				int a = menu();
				switch (a) {
				case 1: {
					unidimensional();
					continue;
				}
				case 2: {
					bidimensional();
					continue;
				}
				case 3: {
					vectores();
					continue;
				}
				case 4: {
					arrayListLinked();
					continue;
				}
				case 5: {
					arrayAutoFill();
					continue;
				}
				case 6: {
					DividePorCero();
					continue;
				}
				case 7:{
					copyFile();
					continue;
				}
				case 99:
					ok = true;
				}

				limpiar();

				// cleanScreen();
			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida, intente con un numero!!");

			}

		} while (!ok);

		System.out.println("La aplicacion ha finalizado");

	}

	public static int menu() {
		limpiar();
		Scanner in = new Scanner(System.in);
		System.out.println("!-----------------------------------------!");
		System.out.println("1.-Ejemplo de Array Unidimensional");
		System.out.println("2.-Ejemplo de Array Bidimensional");
		System.out.println("3.-Ejemplo de Vector");
		System.out.println("4.-Ejemplo de ArrayList -> LinkedList");
		System.out.println("5.-Ejemplo de ArrayList Rellenado con  bucle");
		System.out.println("6.-Ejemplo de División");
		System.out.println("7.-Ejemplo de Copia de Archivo");
		System.out.println("99.-Salir");
		System.out.println("!-----------------------------------------!");
		System.out.print("Elige una opcion: ");
		int resultado = in.nextInt();
		return resultado;
	}

	public static void pausa() {
		System.out.println("\nPresione Enter para continuar...");
		Scanner scan = new Scanner(System.in);
		try {
			scan.nextLine();
		} catch (Exception e) {
			scan.close();
		}

	}

	public static void limpiar() {
		for (int i = 0; i < 12; i++) {
			System.out.println("");
		}
	}

	public static void unidimensional() {
		System.out.println("1.-Ejemplo de Array Unidimensional");
		String[] arreglo = { "Ana", "Abel", "Martha", "Miguel", "Alejandro" };
		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("\nEl valor del arreglo en la posicion %d es: %s", i, arreglo[i]);
		}
		pausa();
	}

	public static void bidimensional() {
		System.out.println("2.-Ejemplo de Array bidimensional");
		int[][] arreglo = new int[3][3];
		arreglo[0][0] = 1;
		arreglo[0][1] = 2;
		arreglo[0][2] = 3;
		arreglo[1][0] = 4;
		arreglo[1][1] = 5;
		arreglo[1][2] = 6;
		arreglo[2][0] = 7;
		arreglo[2][1] = 8;
		arreglo[2][2] = 9;

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {

				System.out.println(arreglo[i][j]);
			}

		}
		pausa();
	}

	public static void vectores() {
		System.out.println("3.-Ejemplo de Vector");
		Vector<String> frutas = new Vector<>();
		frutas.add("Banana");
		frutas.add("Manzana");
		frutas.add("Pera");
		frutas.add("Kiwi");
		frutas.add("Papaya");

		System.out.println(frutas.toString());

		frutas.remove(2);
		frutas.remove(3);

		System.out.println(frutas.toString());

		pausa();
	}

	public static void arrayListLinked() {
		System.out.println("4.-Ejemplo de ArrayList -> LinkedList");
		List<String> lista_array = new ArrayList<>();
		lista_array.add("Java");
		lista_array.add("SpringBoot");
		lista_array.add("Hibernate");
		lista_array.add("JPA");
		lista_array.add("SQL");
		System.out.println(lista_array.toString());

		List<String> lista_linked = new LinkedList<>();
		lista_linked.addAll(lista_array);
		/*
		 * for (String elemento : lista_array) { lista_linked.add(elemento); }
		 */

		for (int i = 0; i < lista_array.size(); i++) {
			System.out.printf("\nEl valor del ArrayList es: %s y del LinkedList es: %s", lista_array.get(i),
					lista_linked.get(i));

		}
		pausa();
	}

	public static void arrayAutoFill() {
		System.out.println("5.-Ejemplo de ArrayList Rellenado con  bucle");

		List<Integer> listaEnteros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listaEnteros.add(i);
		}

		System.out.println(listaEnteros.toString());
		pausa();
	}

	public static void DividePorCero() {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Ingresa el 1er numero: ");
			int num1 = scanner.nextInt();
			System.out.println("Ingresa el 2o. numero: ");
			int num2 = scanner.nextInt();
			int resultado = num1 / num2;
			System.out.printf("\nEl resultado de la division de %d / %d es = %d", num1, num2, resultado);

		} catch (ArithmeticException e) {
			System.out.println("La division por cero no esta permitida");
		} finally {
			System.out.println("\nDemo de Código");
			scanner.close();
		}

		pausa();
	}

	public static void copyFile() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce la ruta del archivo a copiar: ");
		String file = scan.next().toString();
		
		System.out.println("Escribe el nombre de la copia del archivo(ej. texto.txt): ");
		String fileout= scan.next();
		
		try {
			InputStream input = new FileInputStream(file);
			BufferedInputStream bf= new BufferedInputStream(input,1024);
			
			PrintStream out = new PrintStream(fileout);
			
			while(bf.available() != 0) {				
				out.write(bf.read());
			}
			
			input.close();
			out.close();
			scan.close();
		} catch (NoSuchElementException | IOException e) {
			System.out.println(e.getMessage().toString());
			
		}
		
		pausa();
	}
}
