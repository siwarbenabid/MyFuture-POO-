import java.util.Scanner;

public class Personne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Executer le programme");
            System.out.println("2 - Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // yenadhef el buffer ba3d nextInt

            switch (choix) {
                case 1:
                    // ===== el programme mteek =====
                    System.out.println("saisir cin");
                    int cin = sc.nextInt();
                    sc.nextLine();

                    System.out.println("saisir nom");
                    String nom = sc.nextLine();

                    System.out.println("saisir prénom");
                    String prenom = sc.nextLine();

                    System.out.println("saisir ville");
                    String ville = sc.nextLine();

                    System.out.println("cin : " + cin);
                    System.out.println("nom : " + nom);
                    System.out.println("prénom : " + prenom);
                    System.out.println("ville : " + ville);
                    // ===== fin el programme =====
                    break;

                case 2:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, ressayez.");
            }

        } while (choix != 2);

        sc.close();
    }
}

