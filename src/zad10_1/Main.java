package zad10_1;

public class Main {
    public static void main(String[] args) {
        Person person = null;

        try {
            person = new Person("Jan", "K", 876543, 20);
        } catch (ObjectCreationExeption e) {
            System.out.println("cant create object, " + e);
        }
        if (person !=null)
            System.out.println(person);

//        person.setAge(0);
    }


}
