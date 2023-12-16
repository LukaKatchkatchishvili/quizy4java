import java.io.Serializable;
import java.util.List;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String lastname;
    private int age;
    private List<String> tasks;

    public Person(String name, String lastname, int age, List<String> tasks) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.tasks = tasks;
    }

}
