public class Pessoa {
    String nome;
    int idade;
    double peso, altura;
    char sexo;
    String profissao;

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
}
