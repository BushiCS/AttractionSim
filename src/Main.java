import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.peek();
            person.ticketCount--;
            queue.poll();
            System.out.println(person + " прокатился на аттракционе");
            if (person.ticketCount > 0) {
                queue.offer(person);
            }
        }
    }
    static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Andrew", "Garfield", 10));
        personList.add(new Person("Jack", "Daniels", 5));
        personList.add(new Person("Jim", "Beam", 7));
        personList.add(new Person("Elon", "Musk", 3));
        personList.add(new Person("Michael", "Keaton", 12));
        return personList;
    }
}
