import javax.swing.*;

public class ClassAndObject {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        Person shubho = new Person();
        shubho.name = "Shubho";
        shubho.age = 24;

        Person bob =  new Person();

        bob.name = "Bob Marlay";
        bob.age = 20;

        System.out.println("Shubho is " + shubho.age +" Years old" );
        System.out.println("Bob is " + bob.age +" Years old" );
    }
}
