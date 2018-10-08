public class Conditionals {
    public static void main(String[] args) {
        boolean morning = true;
        boolean afternoon =false;
        if(morning){
            System.out.println("Good Morning ");
        }
        if (afternoon){
            System.out.println("Good afternoon");
        }

        int playerX = 50;
        if(true && false){
            System.out.println("and executed");
        }

        if(playerX <0 || playerX > 800) {
            System.out.println("or executed");
        }

    }
}
