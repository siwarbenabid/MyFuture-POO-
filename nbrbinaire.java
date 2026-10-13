
import java.util.Scanner;

public class nbrbinaire {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier :");
        int nombre= sc.nextInt();
        int n = nombre;
        boolean binaire= true;
        while (n!= 0){
            int chiffre = n % 10;
            if (chiffre!=0 && chiffre !=1){
                binaire = false;
                break;
            }
            n=n/10;
        }
        if(binaire){
            System.out.println("Le nombre " + nombre +" est binaire");
        }else {
            System.out.println("Le nombre "+ nombre + " n'est pas binaire");
            sc.close();
        }
    }
}
