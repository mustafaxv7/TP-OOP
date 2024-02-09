package ProgOOP.tp_poo;

public class test {
    public static void main(String args[]){
        Etudiant e1 = new Etudiant("Nadour","L2","3200640",15.2);
        
        // System.out.println(e1);
        System.out.println(e1.nom);
        System.out.println(e1.niveau);
        System.out.println(e1.mat);
        System.out.println(e1.note);
        System.out.println("--------------------------\n");
        // Etudiant e2 = new Etudiant("Mohamed seif","L2","3200644",17.2);
        // System.out.println(e2.nom);
        // System.out.println(e2.niveau);
        // System.out.println(e2.mat);
        // System.out.println(e2.note);
        // System.out.println("--------------------------\n");
        // e2 = e1;
        // System.out.println(e2);
        // System.out.println(e2.mat);
        // System.out.println(e2.note);

        Etudiant e3 = new Etudiant();
        System.out.println(e3);


    }
}
