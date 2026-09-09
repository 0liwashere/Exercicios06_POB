public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Ana Silva";
        funcionario.cargo = "Analista de Sistemas";
        funcionario.salarioBruto = 3000.0;

        System.out.println("Salário bruto antes do aumento: " + funcionario.salarioBruto);

        funcionario.aplicarAumento(10);

        System.out.println("Salário bruto depois do aumento: " + funcionario.salarioBruto);

        double salarioLiquido = funcionario.calcularSalarioLiquido(250.0);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
