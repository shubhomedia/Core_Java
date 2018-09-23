public class Simple_Method {
    public static void main(String[] args) {

        sayHelloWorld();

        sayHelloTo("Shubho");
        sayHelloTo("Media");

        square(5);
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
