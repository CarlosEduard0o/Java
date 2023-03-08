public class Pessoa {
    //Todos os atributos da classe devem ser privados, pois não podemos permitir o acesso aos atributos sem ser através do método.
    //O método acessor "get" é utilizado para obter um valor interno de um objeto, que é privado.
    //O método mutante "set" é utilizado para alterar um valor interno de um objeto, que é privado.
    private String nome;
    private int idade;
    private double peso, altura;
    private char sexo;
    private String profissao;

    public boolean analiseIdade(int idadeDoProfessor){
        if(idadeDoProfessor >= this.idade)
            return true;
        else
            return false;
    }

    Pessoa (String nome, int idade, double peso, double altura, char sexo){  //Como criei um método com o mesmo nome da classe, sempre que eu chamar a classe no
        this.nome = nome;  //programa Main, eu preciso passar esses parametros que estao entre parentese
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaImc(){
        return (this.peso / (this.altura*this.altura));
    }
}
