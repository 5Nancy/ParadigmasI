package lectura.datos;
import java.util.Scanner;
public class DimeTuNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Por favor, dime cómo te llamas:");
		String nombre=s.nextLine();
		System.out.print("¿Cuántos años tienes?");
		int edad=Integer.parseInt(s.nextLine());
		System.out.println("Tu nombre es  " + nombre + " & tu edad es "+edad);
	}

}
