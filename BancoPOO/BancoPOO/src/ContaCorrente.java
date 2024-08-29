public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, Cliente cliente, double saldo, String tipoConta, boolean estadoConta) {
        super(numero, cliente, saldo, tipoConta, estadoConta);
        /* Não precisa passar os atributos estadoConta e saldo no super().
           Ao invés disso, passa o valores deles direto aqui.
           Ex.:
              - this.setSaldo(20);
              - this.setEstadoConta(false);
            Dessa forma, o usuário não mexe nesse atributos, porque o cliente
            só passa seus dados na criação, enquanto que o banco define o
            saldo e o estado da conta no construtor
        */ 
    }

    
    
}
