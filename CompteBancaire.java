public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;

    public CompteBancaire(String num, double soldeInitial, Client t) {
        numeroCompte = num;
        solde = soldeInitial >= 0 ? soldeInitial : 0.0;
        titulaire = t;
        nombreComptes++;
    }

    public String getNumeroCompte() { return numeroCompte; }
    public double getSolde() { return solde; }
    public Client getTitulaire() { return titulaire; }
    public void setTitulaire(Client t) { titulaire = t; }
    public static int getNombreComptes() { return nombreComptes; }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Erreur : le montant du dépôt doit être strictement positif.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Échec : Solde insuffisant sur le compte " + numeroCompte
                    + " (Solde actuel : " + solde + " TND).");
        }
    }

    public void virement(CompteBancaire destination, double montant) {
        System.out.println("\n Tentative de virement de " + montant + " TND vers le compte "
                + destination.getNumeroCompte() + "...");
        if (montant > 0 && montant <= solde) {
            retirer(montant);
            destination.deposer(montant);
            System.out.println("Virement réussi !");
        } else {
            System.out.println("Virement annulé : solde insuffisant ou montant invalide.");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte N° : " + numeroCompte);
        System.out.print("Titulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}