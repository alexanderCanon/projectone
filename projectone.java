import java.util.Scanner;

public class projectone{
	public static void main(String args[]){

		Scanner recibo = new Scanner(System.in);
		int n1=0, n2=0, n3=0;
		String myname ="";

		System.out.println("Escriba su nombre completo: ");
		myname = recibo.nextLine();

		System.out.println("Ingrese el primer numero: ");
		n1 = recibo.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		n2 = recibo.nextInt();

		System.out.println("Ingrese el tercer numero: ");
		n3 = recibo.nextInt();

		System.out.println("Los numeros que ha ingresado son: " + n1 + "," + n2 +"," + n3 + " y su nombre es: " + myname );
	}
}