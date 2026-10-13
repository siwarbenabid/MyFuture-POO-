public class compte {
    int Numérodecompte;
    String dateouverture;
    double montantinitiale;
    public compte (int a, String b, double c){
        Numérodecompte=a;
        dateouverture=b;
        montantinitiale=c;
        }
        public void créditeur( double n){
            montantinitiale=montantinitiale+n;
        }
        public void débiteur( double m){
            montantinitiale=montantinitiale-m;
        }
        public void consulter(){
            System.out.println("Le numéro de compte est: "+ Numérodecompte);
            System.out.println("La date d'ouverture:"+ dateouverture);
            System.out.println("Le montant initiale est: "+ montantinitiale);
        }
        
        }
    

