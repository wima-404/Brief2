 class Livre {
    private String titre;
    private String auteur;
    private static String isbn;
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

     public  String getIsbn() {
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
     public void emprunter(){
         if(!disponible){
             disponible=true;
             System.out.println("Le livre"+titre+"a été emprunter");
         }else{
             System.out.println("Le livre a déja emprunter");
         }
     }
     public void retourner(){
         if(!disponible){
             disponible=false;
             System.out.println("Le Livre"+titre+"a été retourné");
         }else{
             System.out.println("Le livre a déja retourner");
         }
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
