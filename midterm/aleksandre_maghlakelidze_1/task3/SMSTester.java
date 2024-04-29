package midterm.aleksandre_maghlakelidze_1.task3;

public class SMSTester {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Maka");
        s1.setSurname("Kapanadze");
        s1.setPn("12345678912");

        Student s2 = new Student();
        s2.setName("Giorgi");
        s2.setSurname("Giorgadze");
        s2.setPn("111111111111");

        SMS sms = new SMS();
        sms.addStudent(s1);
        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.printStorage();
        sms.removeStudent(s1);
        sms.printStorage(); // Prints twice to demonstrate change in students
    }
}

