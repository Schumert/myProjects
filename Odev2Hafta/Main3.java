// 3

import java.util.Scanner;
import java.lang.Math;


public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r, volume, area, rKare, rKup;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Yarıçap gir: ");
        r = input.nextDouble();
        
        rKare = Math.pow(r, 2);
        rKup = Math.pow(r, 3);
        
        
        area = 4 * Math.PI * rKare;
        volume = (4 * Math.PI * rKup) / 3;
        
        System.out.println("Alan: " + area);
        System.out.println("Hacim: " + volume);
        
        
    }
    
}
//Kürenin alanını ve hacmini hesaplayan program
//1. Yaz "Yarıçap gir".
//2. Oku r
//3. rKare = r^2
//4. rKup = r^3
//5. area = 4 * PISayısı * rKare
//6. volume = (4 * PISayısı * rKup) / 3;
//7. Yazdır area
//8. Yazdır volume

//kürenin alanı 4*pi*r^2
//kürenin hacmi 4/3*pi*r^3
