package zad10_1;

import java.util.Objects;

//Person(firstName, lastName, age, pesel)
public class Person {
    private String firstName, lastName;
    private int pesel, age;

    public Person(String firstName, String lastName, int pesel, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        this.pesel = pesel;
        setAge(age);
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nPesel: %d\nAge: %d", firstName, lastName, pesel, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel == person.pesel &&
                age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 2)
            this.firstName = firstName;
        else
            throw new NameUndefinedException();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (firstName.length() >= 2)
            this.firstName = firstName;
        else
            throw new NameUndefinedException();
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1)
            this.age = age;
        else
            throw new IncorrectAgeException();
    }
}
