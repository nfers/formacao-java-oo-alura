import model.Conta;


/**
 * Classe de inicio onde possui método que permite realizar saques
 *
 * @author Nayara Ferreira
 */
public class AppStart {

    public static void main(String[] args) throws Exception{
        System.out.println("Executando");

        Conta conta = new Conta(1259, 1239, 0.00);

        System.out.println(conta.getValor());

        conta.saca(98.00);

        System.out.println(conta.getValor());
    }
}
