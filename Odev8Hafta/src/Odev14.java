import java.util.Scanner;

public class Odev14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d, n;
		
		System.out.println("Terim sayisini girin");
		n = input.nextInt();
		
		System.out.println("Hangi sayidan baslasin");
		a = input.nextInt();
		
		b = a;
		c = a + 1;
		
		System.out.print(a + " " + b + " " + c + " ");
		
		for (int i = 1; i <= n - 3; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
			System.out.print(d + " ");
		}

	}

}
//Klavyeden girilen terim sayısınca "Tribonacci serisi"ni hesaplayan program.
//Örn: 1 1 2 4 7 13 24 44
