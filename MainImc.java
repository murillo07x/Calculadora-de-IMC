import java.util.Scanner;

public class MainImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IMC i1 = new IMC();

        System.out.println("================================");
        System.out.println("BEM VINDO A CALCULADORA DE IMC");
        System.out.println("================================");

        System.out.println("Digite o seu nome: ");
        i1.nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        i1.idade = scanner.nextInt();

        System.out.println("Digite o seu peso: ");
        i1.peso = scanner.nextInt();

        System.out.println("DIgite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = i1.calcularIMC(altura);

        String classificacao = i1.classificarIMC(altura);

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + i1.nome);
        System.out.println("Idade: " + i1.idade);
        System.out.println("Peso: " + i1.peso);
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);
    }
}
