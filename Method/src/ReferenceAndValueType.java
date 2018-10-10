public class ReferenceAndValueType {
    public static void main(String[] args) {
        int x = 5;
        addOnetTo(x);
        System.out.println(x);

    }
    static void addOnetTo(int number){
        number = number + 1;
    }
}
