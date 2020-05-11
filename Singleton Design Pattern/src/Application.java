public class Application {

    public static void main(String[] args) {


        System.out.println(School.getInstance()+" : "+School.getStudents().size());

        School.addStudent(new Student(1,"Kusal"));

        System.out.println(School.getInstance()+" : "+School.getStudents().size());

        School.addStudent(new Student(2,"Shanuka"));

        System.out.println(School.getInstance()+" : "+School.getStudents().size());

        School.getStudents().forEach(student -> System.out.println(student.getId()+" : "+student.getName()));

    }
}
