public class Person {
    protected String name;
    protected String surname;
    protected int ticketCount;

    public Person (String name, String surname, int ticketCount) {
        this.name = name;
        this.surname = surname;
        this.ticketCount = ticketCount;
    }
    public String toString() {
        return name + " " + surname;
    }
}
