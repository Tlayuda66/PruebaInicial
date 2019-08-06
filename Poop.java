import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float sumas, almacen = 0;
		int numero = 0, contador = 0;
		System.out.println("¿Cuantos numeros sumaras");
		numero = entrada.nextInt();
		for (contador = 1 ; contador <= numero ; contador ++) {
				
			sumas = entrada.nextFloat();
			almacen = sumas + almacen;
				
		}
			
		System.out.println(almacen);	
	}
}