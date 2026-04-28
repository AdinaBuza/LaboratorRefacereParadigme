package lab7;

import lab7.forms.Form;
import lab7.forms.Triangle;
import lab7.forms.Circle;
import lab7.forms.Square;
import lab7.util.PasswordMaker;

public class Main {
    public static void main(String[] args) {

        System.out.println(" \nRezolvare 7.6.1: Utilizare camp static \n");

        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");
        Form f = new Form("green");

        System.out.println(tri);
        System.out.println(f);
        System.out.println("Total instance count is " + Form.getInstanceCount());

        System.out.println("\nRezolvare 7.6.2: Utilizare Singleton \n");


        PasswordMaker pm1 = PasswordMaker.getInstance();

        System.out.println("Password 1: " + pm1.getPassword());
        System.out.println("Password 2: " + PasswordMaker.getInstance().getPassword());

        System.out.println("Number of times getInstance() has been called: " + PasswordMaker.getCallingCounts());
    }
}