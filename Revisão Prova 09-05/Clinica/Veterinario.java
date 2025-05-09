import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Pessoa {

    private String especialidade;
    private List<Animal> animaisAtendidos;
    private SalaAtendimento sala;

    public Veterinario(String nome, String cpf, String especialidade, SalaAtendimento sala) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.sala = sala;
        this.animaisAtendidos = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public SalaAtendimento getSala() {
        return sala;
    }

    public void setSala(SalaAtendimento sala) {
        this.sala = sala;
    }

    public void addAnimaisAtendidos(Animal animal) {
        if (!animaisAtendidos.contains(animal)) {
            animaisAtendidos.add(animal);
            animal.addVeterinario(this);
        }
    }

    public List<Animal> getAnimaisAtendidos() {
        return animaisAtendidos;
    }

    @Override
    public void apresentar() {
        System.out.println();
        System.out.println("[Veterinario] Nome: " + getNome() + ", CPF: " + getCpf());
        System.out.println("Sala: " + getSala().getCodigo() + " (Capacidade " + getSala().getCapacidade() + ")");
        System.out.println("Animais atendidos: ");
        for (Animal animal : animaisAtendidos) {
            System.out.println("Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie());
        }

    }
}