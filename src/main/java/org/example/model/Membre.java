package org.example.model;

import java.time.LocalDate;

public class Membre implements Comparable<Membre> {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private LocalDate dateInscription;

    public Membre(int id, String nom, String prenom, String email, LocalDate dateInscription) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateInscription = dateInscription;
    }

    @Override
    public int compareTo(Membre o) {
        int compareNom = nom.compareTo(o.getNom());
        if (compareNom != 0) {
            return compareNom;
        }

        return this.prenom.compareTo(o.getPrenom());
    }

    @Override
    public String toString() {
        return "Membre : "+this.nom+", "+this.prenom+", "+this.email;
    }

    @Override
    public int hashCode() {
        return this.nom.hashCode()+this.prenom.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Membre) {
            Membre membre = (Membre) obj;
            return this.email.equals(membre.getEmail());
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
//        result = prime * result + ((email == null) ? 0 : email.hashCode());
//        result = prime * result + ((dateInscription == null) ? 0 : dateInscription.hashCode());
//        return result;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }


}
