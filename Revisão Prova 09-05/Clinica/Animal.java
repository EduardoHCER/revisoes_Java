import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String nome;
    private String especie;
    private Cliente dono;
    private List<Veterinario> veterinariosResponsaveis;

    public Animal(String nome, String especie, Cliente dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
        this.veterinariosResponsaveis = new ArrayList<>();
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Cliente getDono() {
        return dono;
    }

    public void addVeterinario(Veterinario veterinario){
        if (!veterinariosResponsaveis.contains(veterinario)) {
            veterinariosResponsaveis.add(veterinario);
            veterinario.addAnimaisAtendidos(this);
        }
    }

    public void apresentar() {
        System.out.println();
        System.out.println("[Animal] Nome: " + getNome());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Dono: " + getDono().getNome());
        System.out.println("Veterinarios Responsáveis: ");
        for (Veterinario vet : veterinariosResponsaveis) {
            System.out.println("- " + vet.getNome());
        }

    }
}
