public class SalaAtendimento {

    private String codigo;
    private int capacidade;


    public SalaAtendimento(String codigo, int capacidade){
        this.codigo = codigo;
        this.capacidade = capacidade;
    }

    // GETTER E SETTER --------------------------------

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }


}
