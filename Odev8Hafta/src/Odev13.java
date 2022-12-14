import java.util.Scanner;

public class Odev13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int c, a, b, n;
		
		System.out.println("Terim sayisini girin");
		n = input.nextInt();
		
		System.out.println("Hangi sayidan baslasin");
		a = input.nextInt();
		b = -1 * a;
		
		System.out.print(a + " " + b + " ");
		
		for (int i = 1; i <= n - 2; i++) {
			c = a - b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}

}
//"NegaFibonacci sayıları" yani negatif fibonacci serisini girilen terim sayısına göre yazan program.
// Örn: 1 -1 2 -3 5 -8 13 -21 
