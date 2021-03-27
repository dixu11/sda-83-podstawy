package obiektowe.composition;

public class PersonDemo {
    public static void main(String[] args) {
        Address address = new Address("Wojska Polskiego","Germany","10","70-391");
        Person person = new Person("Jan Kowalski", 20, address);
        System.out.println(person.getCountryShortcut());
    }
}
