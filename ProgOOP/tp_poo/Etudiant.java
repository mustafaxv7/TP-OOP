package ProgOOP.tp_poo;

public class Etudiant {

    //Attributs
    public String nom , niveau , mat;
    public double note;
    
    //Methodes
    public Etudiant(String nom , String niveau , String mat, double note){
        this.nom = nom;
        this.niveau = niveau;
        this.mat = mat;
        this.note = note;
        System.out.println("Object Created");
    }

    public Etudiant(){
        System.out.println("Object Created");
    }
    
}
