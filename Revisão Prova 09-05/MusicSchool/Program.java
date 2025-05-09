import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        // Instanciar
        // salas;--------------------------------------------------------------------------------
        Room room1 = new Room(1001);
        Room room2 = new Room(2002);

        // Instanciando Professores e
        // alunos.--------------------------------------------------------------------------------
        Teacher teacher1 = new Teacher("Carlos", "123456789-00", "Math", room1);
        Teacher teacher2 = new Teacher("Ana", "987654321-00", "English", room2);
        Student student1 = new Student("Lucas", "111222333-00", "123", room1);
        Student student2 = new Student("Marina", "555666777-00", "456", room1);

        // Adicionando professores a lista do aluno 1
        // (bidirecional).--------------------------------------------------------------------------------
        student1.addTeacher(teacher1);
        student1.addTeacher(teacher2);

        // Adicionando professores a lista do aluno 2
        // (bidirecional).--------------------------------------------------------------------------------
        student2.addTeacher(teacher2);

        // Adicionando todos como classe
        // Person.--------------------------------------------------------------------------------
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(student1);
        persons.add(student2);

        // For each para exibir a informação de todos.
        // --------------------------------------------------------------------------------
        for (Person person : persons) {
            person.apresentar();
        }

        // Mostrando todo os professores do estudante
        // 1.--------------------------------------------------------------------------------
        System.out.println("Teachers of student 1.");
        System.out.println();
        for (Teacher t : student1.getTeachers()) {
            System.out.println("Teacher name: " + t.getName() + ", Speciality: " + t.getSpecialty());
        }

        // Mostrando todo os professores do estudante
        // 2.--------------------------------------------------------------------------------
        System.out.println("Teachers of student 2.");
        System.out.println();
        for (Teacher t : student2.getTeachers()) {
            System.out.println("Teacher name: " + t.getName() + ", Speciality: " + t.getSpecialty());
        }

        // Mostrando apenas os
        // professores.--------------------------------------------------------------------------------
        System.out.println();
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Teacher name: " + teacher.getName() + ", Speciality: " + teacher.getSpecialty()
                        + ", Room: " + teacher.getRoom().getNumber());
            }
        }

        // Trocando os alunos de sala acessando a lista do professor
        // 2.--------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Trocar o aluno Lucas de sala - Atual");
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student name: " + student.getName() + ", Room: " +
                        student.getRoom().getNumber());
                if (student.getName() == "Lucas") {
                    student.setRoom(room2);
                }
            }
        }

        System.out.println();
        System.out.println("Sala Atualizada:");
        for (Student students : teacher2.getStudents()) {
            System.out.println("Student name: " + students.getName() + ", Room: " + students.getRoom().getNumber());
        }

        // Trocando o nome dos alunos do professor
        // 2.--------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Troca de nomes - Atual");
        for (Student student : teacher2.getStudents()) {
            System.out.println("Id: " + student.getRegistration() + ", Name: " + student.getName());
            student.setName("Alex");
        }

        System.out.println("Nomes Atualizados: ");
        for (Student student : teacher2.getStudents()) {
            System.out.println("Id: " + student.getRegistration() + ", Name: " + student.getName());
        }
    }
}
