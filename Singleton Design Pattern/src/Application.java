public class Application {

    public static void main(String[] args) {


//        System.out.println(School.getInstance()+" : "+School.getStudents().size());

        School school = School.getInstance();
        school.students.add(new Student(1,"Kusal"));

        System.out.println(school);
        System.out.println(school.students);

        School school2 = School.getInstance();
        school2.students.add(new Student(2,"Shanuka"));

        System.out.println(school2);
        System.out.println(school2.students);

        school.students.forEach(student -> System.out.println(student.getId()+" : "+student.getName()));
        System.out.println("----");
        school2.students.forEach(student -> System.out.println(student.getId()+" : "+student.getName()));

    }
}
