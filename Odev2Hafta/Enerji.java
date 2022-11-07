//4

import java.util.Scanner;
import java.lang.Math;

public class Enerji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double mass, velocity, h, potentialE, kineticE;
         final double gravitationalAcceleration = 9.80665;
         
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("Maddenin kütle değerini girin: ");
         mass = input.nextDouble();
         
         System.out.println("Maddenin hız değerini girin: ");
         velocity = input.nextDouble();
         
         System.out.println("Maddenin yerden yüksekliğini girin: ");
         h = input.nextDouble();
         
         kineticE = (mass * Math.pow(velocity, 2)) / 2;
         potentialE = mass * gravitationalAcceleration * h;
         
         System.out.println("Kinetik Enerjisi: " + kineticE);
         System.out.println("Potansiyel Enerjisi: " + potentialE);
         
         
        
    }
    
}
//kinetik ve potansiyel enerji hesaplaması yapan program
//1. gravitationalAcceleration = 9.80665;
//2. Yaz "Maddenin kütle değerini girin: "
//3. Oku mass
//4. Yaz "Maddenin hız değerini girin: "
//5. Oku velocity
//6. Yaz "Maddenin yerden yüksekliğini girin: "
//7. Oku h
//8. kineticE = (mass * Math.pow(velocity, 2)) / 
//9. potentialE = mass * gravitationalAcceleration * h
//10. Yazdır kineticE
//11. Yazdır potentialE

