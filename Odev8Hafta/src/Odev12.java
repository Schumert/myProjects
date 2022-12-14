import java.util.Scanner;

public class Odev12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, a = 1, b = 1, c = 0, loopC = 0;
		boolean prime = true;

		System.out.println("Kac sayidan olussun?");
		n = input.nextInt();

		System.out.println("Asal fibonacci sayilari: ");

		while(loopC < n) {
			c = a + b;
			a = b;
			b = c;
			prime = true;
			for (int i = 2; i < c; i++) {
				if( (c % i) == 0 ) {
					prime = false;
				}
			}
			if(prime) {
				loopC++;
				System.out.print(c + " ");
			}
			
		}
		
	}
}
//Klavyeden girilen terim sayısın caFibonacci asallarını listeleyen program. Örn:2,3,5,13,89,233..