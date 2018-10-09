import javax.swing.*;

public class Objects {
    public static void main(String[] args) {
        int number = 5;

        JFrame window = new JFrame();
        window.setTitle("My App");
        window.setSize(500,600);
        window.setVisible(true);

        JLabel label = new JLabel();
        label.setText("My Label1");

        window.add(label);
        String s = "hi";

    }
}
