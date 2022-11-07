//2
import java.util.Scanner;

public class Main2 {

    
    public static void main(String[] args) {
        double degree, rad, grad;
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Açı gir: ");
        degree = input.nextDouble();
        rad = (degree / 360) * (2 * Math.PI);
        grad = degree * 10/9;
        
        System.out.println("Radyan: " + rad + " Gradyan " + grad);
        
    }
    
}
//açıdan radyan ve gradyan bulan program
//1. Yaz "Açı gir"
//2. Oku degree
//3. rad = (degree / 360) * (2 * PISayısı)
//4. grad = degree * 10/9
//5. Yazdır rad
//6. Yazdır grad

// x/360=radyan/2pi
// 180derece=200grad
