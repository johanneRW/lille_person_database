package company;

import java.util.ArrayList;

import static java.util.Collections.*;

public class Application {

    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);

    }

    public void removePerson(Person person) {
        int toRemove = -1;
        for (int i = 0; i < persons.size(); i++) {
            Person personToRemove = persons.get(i);
            String firstName = personToRemove.getFirstName();
            String lastName = personToRemove.getLastName();
            if ((firstName.equals(person.getFirstName())) && (lastName.equals(person.getLastName()))) {
                toRemove = i;
            }
        }
        if (toRemove >= 0) {
            persons.remove(toRemove);
        }
    }

    public Person personFromFullName(String fulName) {
        int space = fulName.indexOf(" ");
        String firstName = fulName.substring(0, space);
        String lastName = fulName.substring(space + 1);
        Person person = new Person(firstName, lastName);
        return person;
    }

    public ArrayList<Person> getPersons() {
        //List.sort(getPersons());
        sort(persons);
        return persons;
    }
}
