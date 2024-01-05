package com.dev.api.rentcarapi.model;

public class Car {

    private int identifiant;
    private String immatriculation;
    private String marque;
    private String model;
    private double kilometrage;
    private byte[] photo;

    public Car() {}

    public Car(
            int identifiant,
            String immatriculation,
            String marque,
            String model,
            double kilometrage,
            byte[] photo)
    {
        this.identifiant = identifiant;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.model = model;
        this.kilometrage = kilometrage;
        this.photo = photo;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}