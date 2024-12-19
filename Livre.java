 class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;
    public Livre(String titre, String auteur , String isbn, boolean disponible){
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;
        this.disponible=disponible;
    }

     public String getTitre() {
         return titre;
     }

     public void setTitre(String titre) {
         this.titre = titre;
     }

     public String getAuteur() {
         return auteur;
     }

     public void setAuteur(String auteur) {
         this.auteur = auteur;
     }

     public static String getIsbn() {
         return isbn;
     }
     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }
     public boolean isDisponible() {
         return disponible;
     }
     public void setDisponible(boolean disponible) {
         this.disponible = disponible;
     }

     @Override
     public String toString() {
         return "Livre{" +
                 "titre='" + titre + '\'' +
                 ", auteur='" + auteur + '\'' +
                 ", isbn='" + isbn + '\'' +
                 ", disponible=" + disponible +
                 '}';
     }
 }
