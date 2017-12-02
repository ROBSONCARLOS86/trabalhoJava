/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Conta {
    private int agencia;
    private int numConta;
    private String tipoConta;
    private float saldo;

    public Conta(int agencia, int numConta) {
        this.agencia = agencia;
        this.numConta = numConta;
    }
    
    public void depositar(double vlDeposito)
    {
        this.saldo += vlDeposito;

    }
    
    public void sacar(double vlSaque)
    {
        this.saldo -= vlSaque;

    }
    
    
    
}
