package br.com.ProjetoSalao.InterfacesDAO;

import java.util.HashMap;

import br.com.ProjetoSalao.Entidades.Atendimento;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;
import br.com.ProjetoSalao.RegrasNegocio.FuncionarioRN;
import br.com.ProjetoSalao.RegrasNegocio.ServicoRN;

public interface AtendimentoDAO {

	public void salvar(Atendimento atendimento);
	public Atendimento buscarAtendimentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado;
	public void excluir(Atendimento atendimento);
	public void editar(Atendimento atendimento);
	public HashMap<Integer,Atendimento> getListaAtendimentos(boolean Status);
    public void desfazerExclusao(Integer codigo);
    public void inicializarLista(Boolean status,FuncionarioRN funcionarioRN,ClienteRN clienteRN,ServicoRN servicoRN);
	
}
