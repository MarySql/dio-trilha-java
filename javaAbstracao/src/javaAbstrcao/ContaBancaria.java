package javaAbstrcao;

import java.util.Scanner;

class ContaBancaria {
	private double saldo;
	private double chequeEspecial;
	private double chequeUsado;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
		this.chequeEspecial = saldoInicial <= 500 ? 50 : saldoInicial * 0.5;
		this.chequeUsado = 0;
	}

	public void consultarSaldo() {
		System.out.printf("Saldo disponível: R$%.2f\n", saldo);
		System.out.printf("Cheque especial disponível: R$%.2f\n", chequeEspecial - chequeUsado);
	}

	public void consultarChequeEspecial() {
		System.out.printf("Limite do cheque especial: R$%.2f\n", chequeEspecial);
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor do depósito deve ser positivo.");
			return;
		}
		if (chequeUsado > 0) {
			double taxa = chequeUsado * 0.2;
			double desconto = Math.min(valor, chequeUsado + taxa);
			chequeUsado -= desconto / 1.2;
			valor -= desconto;
		}
		saldo += valor;
		System.out.printf("Depósito de R$%.2f realizado com sucesso.\n", valor);
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor do saque deve ser positivo.");
			return;
		}
		if (valor <= saldo) {
			saldo -= valor;
			System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valor);
		} else if (valor <= saldo + (chequeEspecial - chequeUsado)) {
			chequeUsado += valor - saldo;
			saldo = 0;
			System.out.printf("Saque de R$%.2f realizado usando cheque especial.\n", valor);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void pagarBoleto(double valor) {
		if (valor <= 0) {
			System.out.println("O valor do boleto deve ser positivo.");
			return;
		}
		sacar(valor);
	}

	public void verificarUsoChequeEspecial() {
		if (chequeUsado > 0) {
			System.out.printf("Você está utilizando R$%.2f do cheque especial.\n", chequeUsado);
		} else {
			System.out.println("Você não está usando o cheque especial.");
		}
	}
}