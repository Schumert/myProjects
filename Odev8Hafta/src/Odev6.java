import java.util.Scanner;

public class Odev6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		double t = 0;
		
		System.out.println("n degeri giriniz.");
		n = input.nextInt();
		
		for (double i = 0; i < n-1; i++) {
			t+= 1 / ( (2 * i + 1) * (2 * i + 2) ); 
		}
		System.out.println(t);

	}

}
//ln(2)= 1/2 + 1/12 + 1/30 + 1+56 + 1/90 + ... şeklinde seriye açılarak yaklaşık olarak hesaplanilmektedir. 
//Girilen terim sayısına göre seri açılımıyla Ln(2) değerini hesaplayıp yazdıran program.

