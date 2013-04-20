package br.com.ProjetoSalao.InterfacesDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;

public interface ServicoDAO {

	public void salvar(Servico servico);
	public Servico buscarServicoPorCodigo(Integer codigo)throws ObjetoNaoEncontrado;
	public void excluir(Servico servico);
	public void editar(Servico servico);
	public List<Servico> getListaServicos(Boolean status);
    public void desfazerExclusao(Integer codigo);
    public void inicializarLista(Boolean status);
	
}
