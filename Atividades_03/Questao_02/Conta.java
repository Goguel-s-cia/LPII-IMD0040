class Conta{

    private Double saldo;

    // 1.
    public Conta() {
        this.saldo = 150.00;
    }

    // 2.
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    // 3.
    public void sacar(Double valor) {
        if(saldo <= valor) {
            System.out.println("Saldo insuficiente para sacar\n");
            return;
        }
        this.saldo -= valor;
    }

    // 4.
    public void getSaldo(){
        System.out.println("O seu saldo atual é de R$ " + this.saldo + "\n");
    }
}