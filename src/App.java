import java.util.*;

public class App {
    enum Gender {
        MALE,
        FEMAIL
    }
    public static void main(String[] args) {
        List<SchoolStudent> studentList = new ArrayList<>();

        studentList.add(new SchoolStudent("a", "Petrov", Gender.MALE));
        studentList.add(new SchoolStudent("b", "Ivanov", Gender.MALE));
        studentList.add(new SchoolStudent("c", "Sidorova", Gender.FEMAIL));
        studentList.add(new SchoolStudent("d", "Ivanova", Gender.FEMAIL));
        studentList.add(new SchoolStudent("a", "Nikolaev", Gender.MALE));
        studentList.add(new SchoolStudent("e", "Abramov", Gender.MALE));
        studentList.add(new SchoolStudent("c", "Elina", Gender.FEMAIL));
        studentList.add(new SchoolStudent("d", "Chizhov", Gender.MALE));
        studentList.add(new SchoolStudent("a", "Timokhin", Gender.MALE));
        studentList.add(new SchoolStudent("b", "Shvedov", Gender.MALE));
        studentList.add(new SchoolStudent("c", "Shilina", Gender.FEMAIL));
        studentList.add(new SchoolStudent("d", "Loseva", Gender.FEMAIL));
        studentList.add(new SchoolStudent("e", "Grishin", Gender.MALE));
        studentList.add(new SchoolStudent("a", "Vasina", Gender.FEMAIL));

        for (SchoolStudent student : studentList) {
            System.out.println(student);
        }

        Set<String> groupList = new HashSet<>();
        for (SchoolStudent student : studentList) {
            groupList.add(student.getGroup());
        }
        for (String group : groupList) {
            System.out.println(group);
        }

        Map<String, Integer> studentMap = new HashMap<>();
        for (SchoolStudent student : studentList) {
            if (studentMap.containsKey(student.getGroup())) {
                int count = studentMap.get(student.getGroup());
                studentMap.put(student.getGroup(), ++count);
            } else {
                studentMap.put(student.getGroup(), 1);
            }
        }

        for (Map.Entry<String, Integer> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry);
        }

        System.out.println("List of student sorted by name:");
        Set<SchoolStudent> treeByName = new TreeSet<>(new NameComporator().reversed());
        treeByName.addAll(studentList);
        for (SchoolStudent student : treeByName) {
            System.out.println(student);
        }
    }
}
