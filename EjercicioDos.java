import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner teclado=new Scanner(System.in);
		int[] sueldos = new int[6];
		int acumulador = 0 ;
		double promedio;
		int suma = 0;
		for (int i = 0; i < 6; i++) {
      System.out.print("Ingrese 6 sueldos: "+(i+1)+": ");
			sueldos[i] = teclado.nextInt();	
			if (sueldos[i] > 5000) {
				acumulador++;
				 suma = (suma + sueldos[i]);
			} 
		}
		promedio = suma / acumulador;
		System.out.print("Promedio de los sueldos ingresadas mayores a $5000: " + promedio);
		}
  }
