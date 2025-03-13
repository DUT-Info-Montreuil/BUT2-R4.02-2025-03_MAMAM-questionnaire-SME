package org.univ_paris8.iut.montreuil.qdev.tp2025.gr3.jeuQuizz.utils;

public enum Langues {
    FRANCAIS("Français"),
    ENGLISH("English"),
    DEUTCH("Deutch"),
    ESPANA("Espana"),
    ITALIA("Italia");

    private final String nom;

    Langues(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}