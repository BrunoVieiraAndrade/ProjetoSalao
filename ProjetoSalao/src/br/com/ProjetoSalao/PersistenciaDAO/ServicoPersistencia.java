package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ServicoDAO;

public class ServicoPersistencia implements ServicoDAO{

	private List<Servico> listaServicos;
	
	@Override
	public void salvar(Servico servico) {
		
		this.listaServicos.add(servico);
		System.out.println("Servico Salvo");
		
	}

	@Override
	public Servico buscarServicoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		Servico servico = new Servico();
		servico.setCodigo(codigo);
		servico.setNome("Corte cabelo");
		servico.setSituacao(true);
		servico.setTipo('A');
		servico.setValor(15.5);
		servico.setValorComissao(30.0);
		
		return servico;
	}

	@Override
	public void excluir(Servico servico) {
		this.listaServicos.remove(servico);
		System.out.println("Servico removido");
		
	}

	@Override
	public void editar(Servico servico) {
		System.out.println("Servico Editado");
		
	}

	@Override
	public List<Servico> getListaServicos(Boolean status) {
		// TODO Auto-generated method stub
		return this.listaServicos;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		System.out.println("Desclusão desfeita servico");
		
	}

	@Override
	public void inicializarLista(Boolean status) {
		this.listaServicos = new ArrayList<Servico>();
		this.listaServicos.add(this.buscarServicoPorCodigo(1));
		
	}

}
