public abstract class Person {

    // Atributos da classe person.
    protected String name;
    protected String cpf;

    public Person() {

    }

    // Construtor de Person
    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // Getter e Setters -------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract void apresentar();

}
