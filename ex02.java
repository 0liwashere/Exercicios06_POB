import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo();
        circulo.raio = raio;

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        scanner.close();
    }
}
