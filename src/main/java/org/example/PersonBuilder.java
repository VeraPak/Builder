package org.example;

public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city = "";

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    @Override
    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Недостаточно данных");
        }
        return new Person(name, surname, age, city);
    }
}