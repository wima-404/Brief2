import java.util.ArrayList;
 class Bibliotheque {
    static ArrayList <Livre>Livres;
    public Bibliotheque(){
        Livres = new ArrayList<>();
    }
    public static void ajouterLivre(Livre livre){
        Livres.add(livre);
        System.out.println("Livre Ajoute :"+livre);
    }
    public static void supprimerLivre(String isbn){
        for (Livre livre : Livres){
            if (livre.getIsbn().equals(isbn)){
                Livres.remove(livre);
                System.out.println("Livre supprime :"+livre);
                return;
            }
        }
        System.out.println("Livre avec ISBN  "+isbn+"introuvable");
    }

     public static void modifierLivre(String isbnToModify) {
     }

     public void modifierLivre(String isbn , String  nouveauTitre , String nouveauAuteur){
        for (Livre livre : Livres ){
            if(livre.getIsbn().equals(isbn)){
                livre.setTitre(nouveauTitre);
                livre.setAuteur(nouveauAuteur);
                System.out.println("Livre modifir :"+livre);
                return;
            }
        }
        System.out.println("Livre avec ISBN "+isbn+"introuvable");
    }
    public static void afficherLivre(){
        if(Livres.isEmpty()) {
            System.out.println("aucun livre dans la bibliotheque .");
        }else{
            for(Livre livre : Livres){
                System.out.println(livre);
            }
        }
    }
    public static void rechercherLivre(String search){
        boolean trouver = false;
        for(Livre livre : Livres){
            if(livre.getTitre().equals(search) || livre.getAuteur().equals(search) || livre.getIsbn().equals(search)){
                System.out.println(livre);
                trouver = true;
            }
        }
    }
 }

