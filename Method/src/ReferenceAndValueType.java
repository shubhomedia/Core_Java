public class ReferenceAndValueType {
    public static void main(String[] args) {
        int x = 5;
        addOnetTo(x);
        System.out.println(x);

        Person john;
        john = new Person("John");
        john.setAge(20);
        celebratedBirthday(john);
        System.out.println(john.getAge());
    }

    private static void celebratedBirthday(Person person){
        person.setAge(person.getAge()+ 1 );
    }

    static void addOnetTo(int number){
        number = number + 1;
    }
}
