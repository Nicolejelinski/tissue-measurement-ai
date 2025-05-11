package com.dasa.tissai.domain.model;

public class Measurement {
    private double tissue; //
    private double weight;

    // constructor
    public Measurement(double tissue, double weight) {
        this.tissue = tissue;
        this.weight = weight;
    }

    // getters and Setters
    public double getTissue() {
        return tissue; // retornaa o valor do comprimento ou área do tecido
    }

    public void setTissue(double tissue) {
        this.tissue = tissue; // define valor do comprimento ou área do tecido
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
