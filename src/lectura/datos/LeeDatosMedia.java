package lectura.datos;
import java.util.Scanner;
public class LeeDatosMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		double media = (x1 + x2 + x3) / 3;
		
		System.out.println("La media de esos tres números es " + media);

	}

}
