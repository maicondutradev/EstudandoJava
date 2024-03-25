import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra;
        Integer numero;
        Double pontoFlutuante;

        System.out.println("Digite um texto: ");
        palavra = sc.nextLine();
        System.out.println("Você digitou o seguinte texto: " + palavra);

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        System.out.println("Você digitou o seguinte numero inteiro: " + numero);

        System.out.println("Digite um número de ponto flutuante: ");
        pontoFlutuante = sc.nextDouble();
        System.out.println("Você digitou o seguinte numero flutuante: " + pontoFlutuante);

        sc.close();

    }
}
