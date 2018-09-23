public class Simple_Method {
    public static void main(String[] args) {

        sayHelloWorld();

        sayHelloTo("Shubho");
        sayHelloTo("Media");

        int x = square(5);
        System.out.println(x);
    }

    static void sayHelloTo(String name){
        System.out.println("Hello, " +  name);
    }

    static void sayHelloWorld() {
        System.out.println("Hello, World");
    }

    static int square(int x){
          return x * x;
    }
}
