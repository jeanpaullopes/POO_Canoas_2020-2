package br.edu.uniritter.canoas.poo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Olá Mundo!");
        Correntista jean = new Correntista("Jean","1234");
        Correntista gabriel = new Correntista("Gabriel", "3456");
        ContaCorrente ct = new ContaCorrente(jean ,1,1234);
        ContaCorrente ct1 = new ContaCorrente(jean, 1, 4321);
        ct.mandinga(ct1.getTitular());
        System.out.println(ct);
        System.out.println(ct1);
        ct1.alterarLimite(400.0);
        System.out.println(ct1);
        System.out.println("o saldo do gabriel é "+ct1.obterSaldo(true));
        System.out.println("o saldo do gabriel é "+ct1.obterSaldo(false));
        ct1.getTitular().setCpf("00000000");
        System.out.println("o saldo do gabriel é "+ct1.obterSaldo(true));
        System.out.println("o saldo do gabriel é "+ct1.obterSaldo(false));
        System.out.println(ct1);
        System.out.println(ct);
    }
}
