import java.util.ArrayList;
import java.util.List;

// Professor herda os atribuso de pessoa
public class Teacher extends Person {

    private String specialty;

    private Room room;// professor recebe 1 sala da class Room;
    private List<Student> students; // Professor pode ter varios alunos. 


    public Teacher(String name, String cpf, String specialty, Room room) {
        super(name, cpf);
        this.specialty = specialty;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addTeacher(this);
        }
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void apresentar() {
        System.out.println();
        System.out.println("Teacher data: ");
        System.out.println("Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Speciality: " + getSpecialty());
        System.out.println("Teacher  room: " + room.getNumber() );
        for (Student student : students) {
            System.out.println("Students list: " + student.getName());
        }
    }

}
