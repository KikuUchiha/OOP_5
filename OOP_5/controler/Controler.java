package controler;

import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

public class Controler {
    private final DataService dataService = new DataService();
    private StudentView studentView = new StudentView();
    private StudentGroupService groupService;

    
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for(User user : userList)
            studentView.printOnConsole(user);
    }

    public Controler() {
        this.groupService = new StudentGroupService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student) groupService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) groupService.create(teacher);
    }

    public StudentGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.createGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printOnConsole(student);
    }

    public List<User> returnStudents() {
        return groupService.read();
    }

}
