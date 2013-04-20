/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.Entidades;

/**
 *
 * @author Kaio
 */
public class Servico {
    
    private Integer codigo;
    private String nome;
    private Double valor;
	private Double porcentagemComissao;
    private char tipo;
    private Boolean situacao;
    
    public Double getValorComissao() {
		return porcentagemComissao;
	}

	public void setValorComissao(Double valorComissao) {
		this.porcentagemComissao = valorComissao;
	}

    public Servico(){
        this.valor = 0.0;
    }
    
    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }
    
    public void setTipo(char tipo) {
    	//1 = Cabelo
    	//2 = Unha
    	//3 = Estética
    	
    	this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
}
