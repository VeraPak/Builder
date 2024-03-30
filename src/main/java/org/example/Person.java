package org.example;
import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city)
                .setAge(0);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
