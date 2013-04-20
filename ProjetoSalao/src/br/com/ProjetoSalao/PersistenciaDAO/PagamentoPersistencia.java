package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ProjetoSalao.Entidades.Pagamento;
import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.PagamentoDAO;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;
import br.com.ProjetoSalao.RegrasNegocio.FuncionarioRN;
import br.com.ProjetoSalao.RegrasNegocio.ServicoRN;

public class PagamentoPersistencia implements PagamentoDAO{

	private List<Pagamento> listaPagamentos;
	
	@Override
	public void realizarPagamento(Pagamento pagamento) {
		
		System.out.println("Pagamento Salvo");
		this.listaPagamentos.add(pagamento);
		
	}

	@Override
	public void efetivarPagamento(Pagamento pagamento) {
		pagamento.setStatus(true);
		System.out.println("Pagamento efetivado.Prova:"+pagamento.isStatus());
		
	}

	@Override
	public Pagamento buscarPagamentoPorCodigo(Integer codigo)
			throws ObjetoNaoEncontrado {
		
		Servico servico = new Servico();
		servico.setCodigo(1);
		servico.setNome("Corte cabelo");
		servico.setSituacao(true);
		servico.setTipo('A');
		servico.setValor(15.5);
		servico.setValorComissao(30.0);
		List<Servico> listaServicos = new ArrayList<Servico>();
		listaServicos.add(servico);
		
		Pagamento pagamento = new Pagamento(listaServicos);
		
		return pagamento;
	}

	@Override
	public void excluir(Pagamento pagamento) {
		listaPagamentos.remove(pagamento);
		
	}

	@Override
	public void editar(Pagamento pagamento) {
		System.out.println("Pagamento editado");
		
	}

	@Override
	public List<Pagamento> getListaPagamentos(boolean Status,
			String dataInicio, String dataFim) {
		// TODO Auto-generated method stub
		return this.listaPagamentos;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		System.out.println("pagamento restaurado");
		
	}

	@Override
	public void inicializarLista(Boolean status, FuncionarioRN funcionarioRN,
			ClienteRN clienteRN, ServicoRN servicoRN) {
		
		this.listaPagamentos = new ArrayList<Pagamento>();
		this.listaPagamentos.add(this.buscarPagamentoPorCodigo(0));
		
		
	}

	
	
	
}
