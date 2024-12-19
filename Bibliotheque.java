import java.util.ArrayList;
 class Bibliotheque {
    private ArrayList <Livre>Livres;
    public Bibliotheque(){
        Livres = new ArrayList<>();
    }
    public void ajouterLivre ( Livre livre){
        Livres.add(livre);
        System.out.println("Livre Ajoute :"+livre);
    }
    public void supprimerLivre (String isbn){
        for (Livre livre : Livres){
            if (Livre.getIsbn().equals(isbn)){
                Livres.remove(livre);
                System.out.println("Livre supprime :"+livre);
                return;
            }
        }
        System.out.println("Livre avec ISBN  "+isbn+"introuvable");
    }
    public void modifierLivre(String isbn , String  nouveauTitre , String nouveauAuteur){
        for (Livre livre : Livres ){
            if(Livre.getIsbn().equals(isbn)){
                livre.setTitre(nouveauTitre);
                livre.setAuteur(nouveauAuteur);
                System.out.println("Livre modifir :"+livre);
                return;
            }
        }
        System.out.println("Livre avec ISBN "+isbn+"introuvable");
    }
    public void afficherLivre(){
        if(Livres.isEmpty()) {
            System.out.println("aucun livre dans la bibliotheque .");
        }else{
            for(Livre livre : Livres){
                System.out.println(livre);
            }
        }
    }
 }

