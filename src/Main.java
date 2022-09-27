import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.ticketCount--;
            System.out.println(person + " прокатился на аттракционе");
            if (person.ticketCount > 0) {
                queue.offer(person);
            }
        }
    }
    static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Andrew", "Garfield", 6));
        personList.add(new Person("Jack", "Daniels", 5));
        personList.add(new Person("Jim", "Beam", 4));
        personList.add(new Person("Elon", "Musk", 3));
        personList.add(new Person("Michael", "Keaton", 1));
        return personList;
    }
}
