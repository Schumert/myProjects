import java.util.Iterator;
import java.util.Scanner;

public class Odev9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int row, num = 1;
		
		System.out.println("Satir sayisi girin.");
		row = input.nextInt();
		
		for (int i = 1; i <= row ; i++) {
			for (int j = 1; j <= i; j++) {
				if(num < 10) {
				System.out.print(num +  "    ");
				}
				else if(num >= 10 && num < 100) {
					System.out.print(num + "   ");
				}
				else if(num >= 100 && num < 1000) {
					System.out.print(num + "  ");
				}
				else if(num >= 1000) {
					System.out.print(num + " ");
				}
				num++;
			}
			System.out.println();
			
		}

	}

}
//Klavyeden girilen satır sayısı için elemanları arasında tab boşluğu olacak şekilde "Floyd Üçgeni"ni 
//ekrana yazdıran program.
//1 
//2 3
//4 5 6
//7 8 9 10
//..