import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x, n, t = 1, f = 1;

		System.out.println("x degeri gir.");
		x = input.nextDouble();
		System.out.println("n degeri gir.");
		n = input.nextDouble();

		for (int i = 1; i < n; i++) {
			f *= i;
			t += Math.pow(x, i) / f;

		}
		System.out.println(t);
		System.out.println(Math.exp(x));

	}

}
//Klavyeden girilen x degeri için, yine klavyeden girilen terim sayısı kadar seriye açarak e^x'i hesaplayan program
//e^x = 1+x/1! + x^2/2! + x^3/3! + ...
