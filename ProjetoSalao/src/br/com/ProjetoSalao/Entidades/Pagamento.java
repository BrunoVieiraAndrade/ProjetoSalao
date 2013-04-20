/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.Entidades;

import java.util.List;

/**
 *
 * @author Kaio
 */
public class Pagamento {

    private List<Servico> lista;
    private Double valorTotal;

    public List<Servico> getLista() {
        return lista;
    }

    public void setLista(List<Servico> lista) {
        this.lista = lista;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {

        for (Servico servico : lista) {

            this.valorTotal+=servico.getValor();

        }
        
    }
}
