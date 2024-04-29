package midterm.aleksandre_maghlakelidze_1.task3;

import java.util.ArrayList;
import java.util.List;

public class SMS {
    // Mapping with Student and their index in the storage
    private List<Student> storage = new ArrayList<Student>();

    // Adds a new student record to the system
    public void addStudent(Student student) {
        storage.add(student);
    }

    // Removes a student record from the system
    public boolean removeStudent(Student student) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Student s = storage.get(i);
            if (s.getPn().equals(student.getPn())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    // Prints all student records in the system
    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Student s : storage) {
                System.out.println(s.getName() + " " + s.getSurname() + ", " + s.getPn());
                System.out.println();
            }
        }
    }
}
