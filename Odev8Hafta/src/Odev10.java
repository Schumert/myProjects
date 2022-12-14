import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, a, b, c = 0;
		int prev = 0, after = 0;

		System.out.println("Sayi girin.");
		n = input.nextInt();

		for (int i = 1; i <= n; i++) { //basini 1 ve girdigimiz sayiya kadar olan tum sayilari yaparak kontrol ediyoruz.
			a = i;
			b = i;
			c = 0;
			//System.out.print(a + " " + a + " "); //fibonaccileri gosterme kodu 1
			while(c<=n) { 
				c = a + b;
				a = b;
				b = c;
				//System.out.print(c + " "); //fibonaccileri gosterme kodu 2
				if (c == n) {
					prev = a;
					after = a + b;
					System.out.println("Girdiginiz fibonacci sayisinin oncesi ve sonrasi: \n"+prev + " " + n + " " + after + " olabilir.");
					
					
				}

			}
			//System.out.println(); //fibonaccileri gosterme kodu 3
		}

	}

}
//Klavyeden girilen büyük değerli Fibonacci sayısına göre, bir önceki ve bir sonraki Fibonacci sayısını
//bulan program.
