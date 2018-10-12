package zad10_1;

import java.util.Objects;

//Person(firstName, lastName, age, pesel)
public class Person {
    private String firstName, lastName;
    private int pesel, age;

    public Person(String firstName, String lastName, int pesel, int age) {
        try {
            setFirstName(firstName);
            setLastName(lastName);
            setAge(age);
        } catch (NameUndefinedException e) {
            System.out.println("Names must be longer than 2 characters. \n" + e);
            throw new ObjectCreationExeption("names");
        } catch (IncorrectAgeException e) {
            System.out.println("Age must be greater then 0");
            throw new ObjectCreationExeption("age");
        }
        this.pesel = pesel;
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

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName.length() >= 2)
            this.firstName = firstName;
        else
            throw new NameUndefinedException("first name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName.length() >= 2)
            this.lastName = lastName;
        else
            throw new NameUndefinedException("last name");
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

    public void setAge(int age) throws IncorrectAgeException {
        if (age >= 1)
            this.age = age;
        else
            throw new IncorrectAgeException();
    }
}
