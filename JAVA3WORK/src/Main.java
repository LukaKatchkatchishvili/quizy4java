import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("luka", "katchkatchishvili", 21, List.of("Task1", "Task2")));
        personList.add(new Person("leri", "giorgobiani", 18, List.of("Task3", "Task4")));

        SerializationUtils.serializeObject(personList, "persons.ser");
        List<Person> deserializedList = SerializationUtils.deserializeObject("persons.ser");
        if (deserializedList != null) {
            for (Person person : deserializedList) {
                System.out.println(person);
            }
        }
    }
}
