import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n ====Menu====");
            System.out.println("1.Ajouter les livres");
            System.out.println("2.Supprimer les livres");
            System.out.println("3.Modifier les livres");
            System.out.println("4.Afficher les livres");
            System.out.println("5.Emprunter les livres");
            System.out.println("6.Retourner les livres");
            System.out.println("7.Afficher les livres disponibles et empruntés");
            System.out.println("8.Quitter");
            System.out.println("6.Choisissez une option :");
            int choix = scanner.nextInt();
            switch (choix){
                case 1:
                    System.out.println("Entrez le titre de livre :");
                    String title = scanner.nextLine();
                    System.out.println("Entrez l'auteur de livre :");
                    String auteur = scanner.nextLine();
                    System.out.println("Entrez ISBN :");
                    String isbn = scanner.nextLine();
                    System.out.println("disponible ou non");
                    boolean disponibilite = scanner.nextBoolean();
                    System.out.println("E");
                    Bibliotheque.ajouterLivre(new Livre(title,auteur,isbn,disponibilite));
                    System.out.println("Livre ajouté .");
                    break;
                case 2 :
                    System.out.println("Entrez ISBN du livre supprimée ");
                    String isbnToDelete = scanner.nextLine();
                    Bibliotheque.supprimerLivre(isbnToDelete);
                    break;
                case 3 :
                    System.out.println("Entrez ISBN du livre a modifié");
                    String isbnToModify = scanner.nextLine();
                    Bibliotheque.modifierLivre(isbnToModify);
                    break;
                case 4:
                    Bibliotheque.afficherLivre();
                    break;
                case 5:
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide");
            }
        }

    }
}
