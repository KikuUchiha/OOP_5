import controler.Controler;
import model.Student;
import model.StudentGroup;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        Student stud1_gr1 = controler.createStudent(new Student("1111", "1111", "1111", 1));
        Student stud2_gr1 = controler.createStudent(new Student("2222", "22222", "2222", 2));
        Teacher teach_gr1 = controler.createTeacher(new Teacher("3333", "3333", "33333", 1));
        StudentGroup group1 = controler.createGroup(1, teach_gr1, stud1_gr1, stud2_gr1);
        Student stud1_gr2 = controler.createStudent(new Student("44444", "4444", "44444", 3));
        Student stud2_gr2 = controler.createStudent(new Student("5555", "5555", "55555", 4));
        Teacher teach_gr2 = controler.createTeacher(new Teacher("6666", "6666", "66666", 2));
        StudentGroup group2 = controler.createGroup(2, teach_gr2, stud1_gr2, stud2_gr2);
        System.out.println(group2.toString());
        System.out.println(group1.toString());
    }
}
