import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Animal> animais;

    public Cliente (String nome, String cpf){
        super(nome,cpf);
        this.animais = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        if (!animais.contains(animal)) {
            animais.add(animal);
        }
    }

    public List<Animal> getAnimal(){
        return animais;
    }

    @Override
    public void apresentar(){
        System.out.println();
        System.out.println("[Cliente] Nome: " + getNome() + ", CPF: " + getCpf());
        System.out.println("Animais do Cliente: ");
        for (Animal animal : animais) {
            System.out.println("- Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie());
        }
    }
}
