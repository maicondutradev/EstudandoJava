public class App {
    public static void main(String[] args) {

        int numeroInteiro = 10;
        float numeroFlutuante = 10.2f;
        double numeroDouble = 50.56;

        System.out.println(numeroInteiro);
        System.out.println(numeroFlutuante);

        System.out.printf("%.2f%n", numeroDouble);
        System.out.println(numeroDouble);

        System.out.println("Hello, World!");

        String nome = "maria";
        int idade = 55;
        double renda = 2400.0;

        // %f = ponto flutuante - %d = inteiro - %s = string - %n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        /////////////////////////////////////////////////////////////////

        // Exercicio de fixação
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(
                "Products%n %s, which price is $ %.2f %n %s, which price is $ %.2f %n %n Record: %d years old, code %d and gender: %c %n %n Measue with eight decimal places: %f %n Rouded (Three decinal places): %.3f %n",
                product1, price1,
                product2, price2, age, code, gender, measure, measure);

    }
}
