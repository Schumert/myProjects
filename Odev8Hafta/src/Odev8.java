import java.util.Scanner;

public class Odev8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, c = 0;

		System.out.println("Bir sayi girin");
		n = input.nextInt();

		for (int a = 1; a < n - 1; a++) {
			for (int b = a + 1; b < n - a; b++) {
				c = n - (a + b);
				if ( (a*a)+(b*b) == (c*c) ) {
					System.out.println(a + " " + b + " " + c + ": sayilari pisagor uclemesidir.");
				}
			}
		}

	}

}
//Klavyeden girilen pozitif tamsayı değere göre "Pisagor üçlemesi"ni hesaplayan program.
//a, b, c, n pozitif tamsayılar olmak üzere  a<b<c , a^2+b^2=c^2 ve a+b+c=n özelliklerini (eşitliklerini)
//sağlayan a,b,c sayıları "Pisagor üçlemesi" olarak adlandırılabilmektedir.
