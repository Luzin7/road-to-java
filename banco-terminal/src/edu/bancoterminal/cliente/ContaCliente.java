package edu.bancoterminal.cliente;

public class ContaCliente implements Cliente {
  private String nomeCliente;
  private String agencia;
  private int numero;
  private double saldo;

  public ContaCliente(String nomeCliente, String agencia, int numero, double saldo) {
      this.nomeCliente = nomeCliente;
      this.agencia = agencia;
      this.numero = numero;
      this.saldo = saldo;
  }

  public String getNome() {
      return nomeCliente;
  }

  public String getAgencia() {
      return agencia;
  }

  public int getNumero() {
      return numero;
  }

  public double getSaldo() {
      return saldo;
  }
}
