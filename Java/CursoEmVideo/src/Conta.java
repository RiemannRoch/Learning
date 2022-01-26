public class Conta {
    public int numConta;
    protected String tipo; // CC para conta corrente, CP para conta poupança
    private String dono;
    private float saldo; //abrir CC ganha 50, abrir CP ganha 150
    private boolean status;

    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " +  this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50.0f);
        } else if (t.equals("CP")){
           this.setSaldo(150.0f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (Math.abs(this.getSaldo()) >= 0.01f){
            System.out.println("ERRO: O saldo da sua conta não é zero!");
        }
        else {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }

    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito de " + valor + " reais na conta de " + this.getDono() + " realizado com sucesso!");
        }
        else {
            System.out.println("ERRO: sua conta está fechada!");
        }

    }

    public void sacar(float valor){
        if (!getStatus()){
            System.out.println("ERRO: sua conta está fechada!");
        }
        else if (getSaldo() < valor){
            System.out.println("Saldo insuficiente!");
        }
        else{
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque de " + valor + " reais na conta de " + this.getDono() + "realizado com sucesso!");
        }

    }

    public void pagarMensalidade(){
        float v;
        if (this.getTipo().equals("CC")){
            v = 12.0f;
        }
        else if (this.getTipo().equals("CP")) {
            v = 20.0f;
        } else {
            System.out.println("Tipo de conta inválido");
            return;
        }

        if(!getStatus()) {
            System.out.println("ERRO: sua conta está fechada!");
        }
        else if (getSaldo() < v){
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
