package org.example.model;

public class Livre implements Comparable<Livre>{
    private int id;
    private String titre;
    private String auteur;
    private String isbn;
    private int anneePublication;
    private boolean disponible;

    public Livre(int id, String titre, String auteur, String isbn, int anneePublication, boolean disponible) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
    }

    @Override
    public int compareTo(Livre o) {
       return this.titre.compareTo(o.titre);
    }

    @Override
    public String toString() {
        return "Livre : "+this.titre+" "+this.auteur+" "+this.isbn+" "+this.anneePublication;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        return result;
//    }

    @Override
    public int hashCode() {
        return this.titre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Livre) {
            Livre livre = (Livre) obj;
            return this.isbn.equals(livre.isbn);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
