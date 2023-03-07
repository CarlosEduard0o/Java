import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Carlos", 24, 72.2, 1.78, 'M'); //Método construtor
        String nomeDaPessoa,disciplina;
        int idadeDoProfessor;
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.peso);
        System.out.println(pessoa.altura);
        System.out.println(pessoa.sexo);
        System.out.print("Digite o nome do professor: ");
        nomeDaPessoa = sc.next();
        pessoa.nome = nomeDaPessoa;
        System.out.print("Digite a idade: ");
        idadeDoProfessor = sc.nextInt();
        pessoa.idade = idadeDoProfessor;
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        if(pessoa.analiseIdade(idadeDoProfessor)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
                System.out.println("A pessoa é menor de idade.");
            }
    }
}
