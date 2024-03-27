package entities; // Define o pacote entities para a classe Triangle

public class Triangle {
    public double a, b, c; // Declara os lados do triângulo como variáveis públicas

    public double area() { // Método para calcular a área do triângulo
        double p = (a + b + c) / 2.0; // Calcula o semiperímetro do triângulo
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Retorna a área usando a fórmula de Herão
    }
}