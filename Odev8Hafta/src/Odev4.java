import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x, n, t = 0, f;

		System.out.println("x degeri gir.");
		x = input.nextDouble();
		System.out.println("n degeri gir.");
		n = input.nextDouble();

		for (int i = 1; i < n; i++) {
			f = 1;
			for (int j = 1; j < 2 * i; j++) {
				f *= j;
			}
			t += (Math.pow(-1, i - 1) * Math.pow(x, 2 * i)) / f;
		}
		System.out.println(t);

	}

}
//cos(x) fonksiyonu, Maclaurin serisine aşağıdaki gibi açılmaktadır.
//Buna göre klavyeden girilen x değerinin kosinüs'ünü belirtilen terim sayısına 
//kadar seriye açarak hesaplayan program.
//cos(x)= 1-x^2/2!+x^4/4!-x^6/6!+x^8/8!-...