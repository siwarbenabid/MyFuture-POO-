    public class Testcompte{
        public static void main(String[] args) {
        compte c1=new compte(3, "14/05/2006", 1230);
        c1.créditeur(50);
        c1.consulter();
        c1.débiteur(30);
        c1.consulter();
        }
    }