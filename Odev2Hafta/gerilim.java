//5

import java.util.Scanner;
import java.lang.Math;

public class gerilim {

   
    public static void main(String[] args) {
        double direnc, akim, gerilim;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Direnç değeri girin: ");
        direnc = input.nextDouble();
        
        System.out.println("Akım değeri girin: ");
        akim = input.nextDouble();
        
        gerilim = akim * direnc;
        
        System.out.println("İletkenin gerilimi: " + gerilim);
        
        
    }
    
}
//gerilim hesaplayan program
//1. Yaz "Direnç değeri girin: "
//2. Oku direnc
//3. Yaz "Akım değeri girin: "
//4. Oku akim
//5. gerilim = akim * direnc
//6. Yazdır gerilim
