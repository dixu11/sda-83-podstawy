package obiektowe.composition;

import java.util.Locale;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getCountryShortcut(){  // zwraca pierwsze 3 litery nazwy państwa
      return   address.getCountry().substring(0,3).toUpperCase();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
