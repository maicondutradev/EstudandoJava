import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; // Importa a classe Triangle do pacote entities

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o padrão de localização para os números (ponto decimal como separador)

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        Triangle x, y; // Declara duas variáveis do tipo Triangle (triângulo) chamadas x e y
        x = new Triangle(); // Instancia um objeto Triangle e atribui a x
        y = new Triangle(); // Instancia outro objeto Triangle e atribui a y

        System.out.println("Enter the measures of triangle X: "); // Solicita ao usuário as medidas do triângulo X
        x.a = sc.nextDouble(); // Lê a medida a do triângulo X
        x.b = sc.nextDouble(); // Lê a medida b do triângulo X
        x.c = sc.nextDouble(); // Lê a medida c do triângulo X

        System.out.println("Enter the measures of triangle Y: "); // Solicita ao usuário as medidas do triângulo Y
        y.a = sc.nextDouble(); // Lê a medida a do triângulo Y
        y.b = sc.nextDouble(); // Lê a medida b do triângulo Y
        y.c = sc.nextDouble(); // Lê a medida c do triângulo Y

        double areaX = x.area(); // Calcula a área do triângulo X
        double areaY = y.area(); // Calcula a área do triângulo Y

        System.out.printf("Triangle X area: %.4f%n", areaX); // Exibe a área do triângulo X com 4 casas decimais
        System.out.printf("Triangle Y area: %.4f%n", areaY); // Exibe a área do triângulo Y com 4 casas decimais

        if (areaX > areaY) {
            System.out.println("Larger area: X"); // Se a área de X for maior, exibe que X tem a área maior
        } else {
            System.out.println("Larger area: Y"); // Caso contrário, exibe que Y tem a área maior
        }

        sc.close(); // Fecha o Scanner
    }
}