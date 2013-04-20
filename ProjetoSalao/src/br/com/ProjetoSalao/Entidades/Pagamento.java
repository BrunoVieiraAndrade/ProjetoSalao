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

	private Integer codigo;
    private List<Servico> listaServicos;
    private Double valorTotal;
    private boolean status;
    
    public Pagamento (List<Servico>lista){
    	
    	this.listaServicos = lista;
    	this.setStatus(true);
    }
    
    public boolean isStatus() {
		return status;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public List<Servico> getLista() {
        return listaServicos;
    }

    public void setLista(List<Servico> lista) {
        this.listaServicos = lista;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {

        for (Servico servico : listaServicos) {

            this.valorTotal+=servico.getValor();

        }
        
    }
}
