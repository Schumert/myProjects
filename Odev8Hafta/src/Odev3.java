import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x, n, t = 0, f;

		System.out.println("x degeri gir.");
		x = input.nextDouble();
		System.out.println("n degeri gir.");
		n = input.nextDouble();
		
		for (int i = 1; i < n; i++) {
			f = 1;
			for (int j = 1; j < 2*i-1; j++) {
				f*=j;
			}
			t+= (Math.pow(-1, i-1) * Math.pow(x, 2*i-1))/f;
		}
		System.out.println(t);
		
		
	}
	

}
//sin(x) fonksiyonu, Maclaurin saerisine aşağıdaki gibi açılmaktadır. 
//Buna göre klavyeden girilen x açısının sinüs değerini, belirtilen terim sayısına
//göre açarak hesaplayan program.
// sin(x) = x - x^3/3! + x^5/5! - x^7/7! + x^9/9! - ...