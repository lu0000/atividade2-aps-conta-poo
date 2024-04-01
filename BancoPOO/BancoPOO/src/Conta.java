import javax.swing.JOptionPane;
import java.lang.Integer;

public class Conta {
    private String numero;
    private Cliente cliente;
    private double saldo;
    private String tipoConta; //Conta Corrente ou Conta Poupança
    private boolean estadoConta; //A conta está aberta ou fechada

    //Construtor
    public Conta(String numero, Cliente cliente, double saldo, String tipoConta, boolean estadoConta) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.estadoConta = estadoConta;
    }

    //Gets e sets
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public boolean isEstadoConta() {
        return estadoConta;
    }
    public void setEstadoConta(boolean estadoConta) {
        this.estadoConta = estadoConta;
    }

    //Método depositar
    public void depositar(double valor){
        this.saldo += valor;
    }

    //Método Sacar
    boolean sacar(double valor){
        if (this.estadoConta == true & this.saldo >= valor){ //Para fazer o saque apenas estando com a conta aberta e se o saldo for maior ou igual ao valor do saque.
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    //Criar Conta - Quando uma conta é criada, começa sem saldo, fechada e com o nome da pessoa
    public void criarConta(Cliente nome, String tipoConta, boolean estadoConta){
        this.tipoConta = JOptionPane.showInputDialog("Informe o tipo de conta que deseja (Escolha entre Conta Corrente e Conta Poupança): ");
        //this.cliente.setNome(nome) = JOptionPane.showInputDialog("Informe seu nome: ");
        this.saldo = 0;
        estadoConta = false;
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso! Lembrando sua conta foi criada, mas ainda está fechada, por isso faça um depósito de R$20,00 caso seja Conta Corrente e R$100,00 caso seja Conta Poupança. Fazendo esse depósito, consiguirá usufruir livremente de sua conta");
    }

    //Abrir conta
    public boolean abrirContaCorre(double saldo){
        double valorCC = 20.00;
        double valorCP = 100.00;
    if(tipoConta == "Conta Corrente".intern()){
        if(Integer.compare(this.saldo, valorCC)) {
            estadoConta = true;
        }else{
            estadoConta = 
        }

    }
    }

    
}