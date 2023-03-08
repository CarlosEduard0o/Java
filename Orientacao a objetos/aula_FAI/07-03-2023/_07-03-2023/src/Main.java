import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Carlos", 24, 72.2, 1.78, 'M'); //Método construtor
        String nomeDaPessoa,disciplina;
        int idadeDaPessoa;
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        //System.out.println(pessoa.peso);
        //System.out.println(pessoa.altura);
        //System.out.println(pessoa.sexo);
        System.out.print("Digite o nome da pessoa: ");
        nomeDaPessoa = sc.next();
        pessoa.setNome(nomeDaPessoa);
        System.out.print("Digite a idade: ");
        idadeDaPessoa = sc.nextInt();
        pessoa.setIdade(idadeDaPessoa);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        if(pessoa.analiseIdade(idadeDaPessoa)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }
        System.out.print("O IMC é: ");
        System.out.printf("%.2f" , pessoa.calculaImc());
        System.out.println();
        System.out.print("A altura é: ");
        System.out.println(pessoa.getAltura());
    }
}
