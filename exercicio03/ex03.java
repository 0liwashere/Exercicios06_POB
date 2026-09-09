public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Pedro";
        conta.numeroConta = "12345-6";

        conta.consultarSaldo();

        conta.depositar(500);
        conta.consultarSaldo();

        conta.sacar(200);
        conta.consultarSaldo();

        conta.sacar(1000);

        conta.depositar(-50);
        conta.consultarSaldo();
    }
}
