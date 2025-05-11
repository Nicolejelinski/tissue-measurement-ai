package com.dasa.tissai.domain.model;

public class Patient {
    private String name;
    private String id;
    private double weight;

    // constructor
    public Patient(String name, String id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
