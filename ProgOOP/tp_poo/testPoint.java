package ProgOOP.tp_poo;

public class testPoint {
    public static void main (String args[]){
        Point p1 = new Point(5,3);
        System.out.println(p1.x + " " + p1.y);
        p1.x += 2;
        p1.y += 4;
        System.out.println(p1.x + " " + p1.y);
    }
}
