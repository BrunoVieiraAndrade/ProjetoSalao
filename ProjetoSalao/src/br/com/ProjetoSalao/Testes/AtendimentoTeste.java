package br.com.ProjetoSalao.Testes;

import br.com.ProjetoSalao.Entidades.Atendimento;
import br.com.ProjetoSalao.RegrasNegocio.AtendimentoRN;

public class AtendimentoTeste {

	public static void main(String[] args){
		
		Atendimento atendimento = new Atendimento();
		atendimento.setCodigo(1);
		AtendimentoRN atendimentoRN = new AtendimentoRN();
		
		atendimentoRN.inicializarLista(null, null, null, null);
		atendimentoRN.salvar(atendimento);
		
		Atendimento atendimento1 = atendimentoRN.buscarAtendimentoPorCodigo(0);
		System.out.println(atendimento1.getCliente().getNome());
		
	}
	
}
