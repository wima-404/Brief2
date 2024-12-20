import java.util.List;
public class Utilisateur {
    static String nom;
    static List<Livre> livresEmprunter;

    public Utilisateur() {
        this.nom = nom;
        this.livresEmprunter = livresEmprunter;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void emprunter (String titree ){
        for(Livre livre : Bibliotheque.Livres ){
            if(livre.getTitre().equals(titree) && livre.isDisponible() ){

                System.out.println("l'adherent " + nom +  " a emprunté le livre  " + titree);
                livresEmprunter.add(livre);
                livre.setDisponible(false);


            }else if(livre.getTitre().equals(titree) && !livre.isDisponible()){


                System.out.println(" livre  indisponible !" );


            }

        }

    }
    public Livre retourner (String titre  ){
        for(Livre livre : livresEmprunter){
            if(livre.getTitre().equals(titre) ){

                System.out.println("l'adherent " +nom+ "a retourné le livre " +titre);
                Bibliotheque.Livres.add(livre);
                livre.setDisponible(true);


            }else if(livre.getTitre().equals(titre) && livre.isDisponible()){


                System.out.println(" livre  deja existe  !" );


            }

        }
        return null;

    }
    public  void AfficherLivresEmpruntes(){
        for(Livre livre : livresEmprunter){
            System.out.println(livre);
        }
    }
    /*public static void emprunterLivre(Livre livre){
        if(!livre.isDisponible()){
            livre.emprunter();
            livresEmprunter.add(livre);
        }else{
            System.out.println("impossible le livre déja emprunter");
        }
    }
    public static void retournerLivre(Livre livre){
        if(!livre.isDisponible()){
            livre.retourner();
            livresEmprunter.remove(livre);
        }else{
            System.out.println("impossible déja retourner");
        }
    }
    public static void afficherLivreEmprunter(){
        if(livresEmprunter.isEmpty()){
            System.out.println(nom+"n'a pas empruntée");
        }else{
            System.out.println("livre emprunté");
            for(Livre livre:livresEmprunter){
                System.out.println(livre);
            }
        }
    }*/
}
