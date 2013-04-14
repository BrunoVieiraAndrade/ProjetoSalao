package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ServicoDAO;

public class ServicoPersistencia implements ServicoDAO{

	@Override
	public void salvar(Servico servico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Servico buscarServicoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Servico servico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Servico servico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Servico> getListaServicos(Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicializarLista(Boolean status) {
		// TODO Auto-generated method stub
		
	}

}
