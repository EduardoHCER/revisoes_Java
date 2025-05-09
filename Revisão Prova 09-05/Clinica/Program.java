import java.util.ArrayList;
import java.util.List;

public class Program {

    public static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        // Instancia Clientes.
        Cliente cliente1 = new Cliente("Joana Silva", "123456789-00");
        Cliente cliente3 = new Cliente("Pedro Oliveira", "333-444-555-00");
        // Instacia Animais.
        Animal animal1 = new Animal("Rex", "Cachorro", cliente1);
        Animal animal2 = new Animal("mimi", "Gato", cliente1);
        Animal animal3 = new Animal("Bolota", "Porquinho-da-India", cliente3);
        // Instancia Salas.
        SalaAtendimento sala1 = new SalaAtendimento("1001", 3);
        // Instancia Veterinarios.
        Veterinario veterinario1 = new Veterinario("Dr. Marcos", "111222333-00", "Cirurgia", sala1);

        pessoas.add(cliente1);
        pessoas.add(veterinario1);

        cliente1.addAnimal(animal1);
        cliente1.addAnimal(animal2);

        veterinario1.addAnimaisAtendidos(animal3);
        // Declarando que os animais da cliente 1, são atendidos pelo Veterinario1.
        for (Animal c : cliente1.getAnimal()) {
            veterinario1.addAnimaisAtendidos(c);
        }

        cliente1.apresentar();
        veterinario1.apresentar();
        animal3.apresentar();

    }
}
