package company;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Application app = new Application();
    private boolean running = true;


    public void run() {
        while (running) {
            System.out.println("""
                    
                    Skriv 'add' for at tilføje en ny person til listen
                    Skriv 'remove' for at fjerne en person
                    Skriv 'exit' for at afslutte applicationen""");

            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("add")) {
                System.out.println("Skriv navnet på den person du vil tilføje:");
                String fullName = scanner.nextLine();
                Person newPerson = app.personFromFullName(fullName);
                app.addPerson(newPerson);
                System.out.println(app.getPersons());

            } else {
                if (choice.equalsIgnoreCase("remove")) {
                    System.out.println("Skriv navnet på den person du vil fjerne:");
                    String fullName = scanner.nextLine();
                    Person toRemove = app.personFromFullName(fullName);
                    app.removePerson(toRemove);
                    System.out.println(app.getPersons());
                } else if (choice.equalsIgnoreCase("exit")) {
                    running = false;
                } else {
                    System.out.println("Du skal vælge fra menuen");
                }
            }
        }
    }
}