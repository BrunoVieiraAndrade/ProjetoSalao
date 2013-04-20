/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.Entidades;

/**
 *
 * @author Kaio
 */
public class Cliente extends Pessoa{
    
    private Double saldo;
    private boolean pendente;

    public Cliente(){
        
        this.saldo = 0.0;
        this.pendente = false;
        this.setStatus(true);
        
    }
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean status) {
        this.pendente = status;
    }
    
}
