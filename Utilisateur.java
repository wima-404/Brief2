import java.util.ArrayList;
import java.util.List;
public class Utilisateur {
    static String nom;
    static List<Livre> livresEmprunter;

    public Utilisateur(String nom, List<Livre> livresEmprunter) {
        this.nom = nom;
        this.livresEmprunter = livresEmprunter;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public static void emprunterLivre(Livre livre){
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
    }
}
