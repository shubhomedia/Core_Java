import javax.swing.*;

public class ClassAndObject {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        Person shubho = new Person("Shubho");
        shubho.setAge(20);

        Person bob = new Person("bob");
        bob.setAge(24);
        System.out.println(shubho.getAge()+shubho.getName());
        System.out.println(bob.getAge()+bob.getName());
    }
}
