import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String registration;
    private List<Teacher> teachers;
    private Room room;

    public Student(String name, String cpf, String registration, Room room) {
        super(name, cpf);
        this.registration = registration;
        this.room = room;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            teacher.addStudent(this);
        }
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public void apresentar() {
        System.out.println();
        System.out.println("Student data: ");
        System.out.println("Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Registration: " + getRegistration());
        for (Teacher teacher : teachers) {
            System.out.println("Teacher name: " + teacher.getName());
        }

    }

}
