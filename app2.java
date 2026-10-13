
import java.util.Scanner;

public class app2{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Saisissez n: ");
        double n= sc.nextDouble();
        System.out.print("Saisissez m: ");
        double m= sc.nextDouble();
        if (n<m) {
            System.out.println("le nombre le plus grand entre n et m est "+ m);
        }
        else {
            System.out.println("le nombre le plus grand entre n et m est "+ n);
        }
        
    }
    
}
    

