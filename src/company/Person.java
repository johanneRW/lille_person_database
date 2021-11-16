package company;

public class Person implements Comparable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Object other) {
        Person otherPerson = (Person) other;
        return firstName.compareTo(otherPerson.firstName);
    }
}
