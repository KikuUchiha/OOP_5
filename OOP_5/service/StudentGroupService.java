package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.User;

public class StudentGroupService {
    
    public StudentGroup createGroup(Integer number, Teacher teacher, Student... students){
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudentGroup(number, teacher, listStudent);
    }

    List<User> listUser;

    public StudentGroupService() {
        this.listUser = new ArrayList<>();
    }
    

    public User create(User user) {
        if (user instanceof Student){
            int id = maxStudentId();
            listUser.add(new Student(user.getFirstName(), user.getSecondName(), user.getLastName(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getFirstName(), user.getSecondName(), user.getLastName(), id));
        }

        return listUser.get(listUser.size() - 1);
    }

    private int maxTeacherId() {
        for (int i = listUser.size() - 1; i > -1 ; i--) {
            if (listUser.get(i) instanceof Student){
                return i + 1;
            }
        }
        return 1;
    }

    private int maxStudentId() {
        for (int i = listUser.size() - 1; i > -1 ; i--) {
            if (listUser.get(i) instanceof Teacher){
                return i + 1;
            }
        }
        return 1;
    }


    public List<User> read() {
        return listUser;
    }

}
