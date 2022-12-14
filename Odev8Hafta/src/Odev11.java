import java.util.Iterator;
import java.util.Scanner;

public class Odev11 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k, a = 1, b = 0, c;
		System.out.println("Terim sayisini girin.");
		k = input.nextInt();
		
		for (int i = 1; i <= k; i++) {
			c = a + 2 * b;
			System.out.println(c + " ");
			a = b;
			b = c;
			
		}


	}

}
//Klavyeden girilen terim sayısı kadar "Pell sayıları"nı ekrana yazdıran program.
//0, 1, 2, 5, 12, 29, 70, 169, 408, 985.. sayıları "Pell sayıları" olarak adlandırılır.
//P0=0 P1=1 ve Pn=2Pn-1+Pn-2