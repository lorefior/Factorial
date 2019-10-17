package factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		double n;
		double fac=1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		n = entrada.nextInt();
		while ( n!=0) {
			  fac=fac*n;
			  n--;
			}
		System.out.println( "Su factorial es:" +fac);
	}

}
