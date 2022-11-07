//7

import java.util.Scanner;
import java.lang.Math;


public class bedenKitleIndeks {

    
    public static void main(String[] args) {
       double kg, boy, index;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Kilonuzu girin: ");
       kg = input.nextDouble();
       
       System.out.println("Boyunuzu girin: ");
       boy = input.nextDouble();
       
       index = kg / (Math.pow(boy, 2));
       
        if (index <= 18.49) {
            System.out.print("Index: " + index + ": ");
            System.out.println("İdeal kilonun altındasınız.");

            
        }
        else if (index >= 18.50 && index <= 24.99) {
            
            System.out.print("Index: " + index + ": ");
            System.out.println("İdeal kilodasınız.");
            
        }
        else if (index >= 25 && index <= 29.99) {
            
            System.out.print("Index: " + index + ": ");
            System.out.println("İdeal kilonun üzerindesiniz.");
        }
        else   {
          
            System.out.print("Index: " + index + ": ");
            System.out.println("İdeal kilonun çok üzerindesiniz.");
        }
         
       
       
       
       
    }
    
}
//beden kitle index'i veren program
//1. Yaz "Kilonuzu girin: ".
//2. Oku kg.
//3. Yaz "Boyunuzu girin: ".
//4. oku boy.
//5. index = kg / boy^2.
//6. Eğer index <= 18.49, Yaz "İdeal kilonun altındasınız.".
//7. Eğer index >= 18.50 && index <= 24.99, Yaz "İdeal kilodasınız.".
//8. Eğer index >= 25 && index <= 29.99, Yaz "İdeal kilonun üzerindesiniz.".
//9. Değilse Yazdır "İdeal kilonun çok üzerindesiniz.".
//10. Bitir.
