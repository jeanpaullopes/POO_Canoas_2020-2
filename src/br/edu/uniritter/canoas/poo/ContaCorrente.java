package br.edu.uniritter.canoas.poo;

import java.util.Date;

public class ContaCorrente {

    private Correntista titular;
    private int agencia;
    private int noConta;
    private double saldo;
    private Date dataAbertura;
    private double limite;

    public ContaCorrente(Correntista titular, int agencia, int noConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.noConta = noConta;
    }

    public Correntista getTitular() {
        return titular;
    }

    public double obterSaldo(boolean comLimite) {
        if (comLimite) {
            // nunca faça isto: dar RETURN dentro de um if
            return this.saldo + this.limite;
        } else {
            return this.saldo;
        }
    }
    public void mandinga(Correntista nunseiquemeh){
        Correntista crr = nunseiquemeh;
        crr.setNome("pernalonga");
    }
    public boolean alterarLimite(double novoLimite){
        /*
        boolean ret = false;

        if (this.saldo + novoLimite >= 0) {
            ret = true;
            this.limite = novoLimite;
        }
         */

        boolean ret = true;

        if (this.saldo + novoLimite < 0) {
            ret = false;
        } else {
            this.limite = novoLimite;
        }

        return ret;
    }
    @Override
    public String toString() {
        return "Titular: "+titular.getNome()+"("+titular.getCpf()+")"+" ag/conta: "+agencia+" "+noConta+
                " saldo: "+saldo +" limite: "+limite+
                " saldo final: "+(this.saldo+this.limite) ;
    }


}
