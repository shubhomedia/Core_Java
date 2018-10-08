public class Scope {
    static  int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println(x);
        doSometing();
        System.out.println(x);
    }

    static void doSometing(){
        x =  10;

    }
    static void doSometingLocally(){
        int y = 100;
    }
}
