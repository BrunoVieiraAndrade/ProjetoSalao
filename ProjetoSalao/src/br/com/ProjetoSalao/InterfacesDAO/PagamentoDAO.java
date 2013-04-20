package br.com.ProjetoSalao.InterfacesDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Pagamento;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;
import br.com.ProjetoSalao.RegrasNegocio.FuncionarioRN;
import br.com.ProjetoSalao.RegrasNegocio.ServicoRN;

public interface PagamentoDAO {
	
	public void realizarPagamento(Pagamento pagamento);
	public void efetivarPagamento(Pagamento pagamento);
	public Pagamento buscarPagamentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado;
	public void excluir(Pagamento pagamento);
	public void editar(Pagamento pagamento);
	public List<Pagamento> getListaPagamentos(boolean Status,String dataInicio,String dataFim);
    public void desfazerExclusao(Integer codigo);
    public void inicializarLista(Boolean status,FuncionarioRN funcionarioRN,ClienteRN clienteRN,ServicoRN servicoRN);
	
}
