package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro 0'dan küçük olamaz");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index!");
        } else if (developerNames[index] != null) {
            System.out.println("Bu index zaten dolu!!");
        } else {
            developerNames[index] = name;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
