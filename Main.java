import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Bibliotheque bibliotheque = new Bibliotheque();
        Utilisateur utilisateur = new Utilisateur();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n ====Menu====");
            System.out.println("1.Ajouter les livres");
            System.out.println("2.Supprimer les livres");
            System.out.println("3.Modifier les livres");
            System.out.println("4.Afficher les livres");
            System.out.println("5.Rechercher les livres");
            System.out.println("6.Emprunter les livres");
            System.out.println("7.Retourner les livres");
            System.out.println("8.Afficher les livres disponibles et empruntés");
            System.out.println("9.Quitter");
            System.out.println("10.Choisissez une option :");
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
                    scanner.nextLine();
                    bibliotheque.ajouterLivre(new Livre(title,auteur,isbn,disponibilite));
                    System.out.println("Livre ajouté .");
                    break;
                case 2 :
                    System.out.println("Entrez ISBN du livre supprimée ");
                    String isbnToDelete = scanner.nextLine();
                    bibliotheque.supprimerLivre(isbnToDelete);
                    break;
                case 3 :
                    System.out.println("Entrez ISBN du livre à modifier");

                    String isbnToModify = scanner.nextLine();

                    System.out.println("Entrez le nouveau titre du livre");
                    String newTitle = scanner.nextLine();

                    System.out.println("Entrez le nouveau nom de l'auteur");
                    String newAuthor = scanner.nextLine();

                    break;
                case 4:
                    bibliotheque.afficherLivre();
                    break;
                case 5:
                    System.out.println("Rechercher : ");
                    String search = scanner.nextLine();
                    bibliotheque.rechercherLivre(search);
                    break;
                case 6:
                    System.out.println("Entrez le nom :");
                    String nNom = scanner.next();
                    utilisateur.setNom(nNom);
                    System.out.println("Entrez le livre que vous voullez emprunter");
                    String mNom = scanner.next();
                    utilisateur.emprunter(mNom);
                    break;
                case 7:
                    System.out.println("Entrez le Nom");
                    String dNom = scanner.next();
                    utilisateur.setNom(dNom);
                    System.out.println("Entrez le livre que vous voullez retourner");
                    String qNom = scanner.next();
                    utilisateur.retourner(qNom);
                    break;
                case 8:
                    utilisateur.AfficherLivresEmpruntes();
                    break;
                case 9:
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide");
            }
        }

    }
}
