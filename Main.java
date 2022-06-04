package EjercicioUno;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
	        int[] numeros = new int[5];
          int mayor, menor;
          
	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Ingrese 5 numeros: "+(i)+": ");
	            numeros [i] = teclado.nextInt();
	        }
	       
	         mayor = numeros [0];  
           menor = numeros [0]; 
	       
	        for (int i = 0; i < 5; i++) {
	            if(numeros [i] > mayor) {
	                mayor = numeros[i];
	            }
	            else if(numeros[i]<menor) {
	                menor = numeros[i];
	            }
	        }
	        System.out.println("El mayor valor es: "+mayor);
	        System.out.println("El menor valor es: "+menor);
  }
}