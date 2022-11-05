import java.sql.SQLOutput;

public class ContaCorrrente extends Conta {

    public ContaCorrrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
