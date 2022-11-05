
public class Main {
    public static void main(String[] args) {
        Cliente sidnei = new Cliente();
        sidnei.setNome("Sidnei");


        IConta cc = new ContaCorrrente(sidnei);
        IConta poupanca = new ContaPoupanca(sidnei);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
