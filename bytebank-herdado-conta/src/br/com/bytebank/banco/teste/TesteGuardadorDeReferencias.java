package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cp = new ContaPoupanca(22, 11);
		guardador.adiciona(cp);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Quantidade de contas: " + tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println("Número da conta: " + ref.getNumero());
	}

}
