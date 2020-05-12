import java.util.ArrayList;

public class School {

//    private ArrayList<Student> students;

    public ArrayList<Student> students;
    public static volatile School school;

    private School(){
        if (school != null){
            throw new RuntimeException("please use getInstance method.");
        }
    }

    public static School getInstance(){
        if (school == null){
            synchronized (School.class){
                if (school == null){
                    school = new School();
                    school.students = new ArrayList<>();
                }
            }
        }
        return school;
    }

//    public static void addStudent(Student student){
//        getStudents().add(student);
//    }
//
//    public static ArrayList<Student> getStudents(){
//        if (getInstance().students == null){
//            synchronized (School.class){
//                if (getInstance().students == null){
//                    school.students = new ArrayList<>();
//                }
//            }
//        }
//        return getInstance().students;
//    }

}
