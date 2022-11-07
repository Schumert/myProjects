import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) throws InterruptedException {
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi gir. ");
		n = input.nextInt();
				
		for(int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				Thread.sleep(10);
				System.out.print("* ");
				
			}
			System.out.println();
		}
		

	}

}
