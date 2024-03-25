public class App {
    public static void main(String[] args) {

        GabrielDaButico();
        Soma(5, 5);

    }

    public static void GabrielDaButico() {
        System.out.println("Ainnn nobru apelaum");
    }

    public static int Soma(Integer numero1, Integer numero2) {
        Integer soma;
        soma = numero1 + numero2;
        System.out.println("A soma do numero " + numero1 + " e do numero " + numero2 + " é " + soma);
        return soma;
    }
}
