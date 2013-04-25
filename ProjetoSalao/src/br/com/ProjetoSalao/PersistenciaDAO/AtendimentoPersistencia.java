package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.HashMap;
import br.com.ProjetoSalao.Entidades.Atendimento;
import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Entidades.Funcionario;
import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.AtendimentoDAO;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;
import br.com.ProjetoSalao.RegrasNegocio.FuncionarioRN;
import br.com.ProjetoSalao.RegrasNegocio.ServicoRN;

public class AtendimentoPersistencia implements AtendimentoDAO{

	private HashMap<Integer,Atendimento> listaAtendimentos;
	
	@Override
	public void salvar(Atendimento atendimento){
		
		listaAtendimentos.put(atendimento.getCodigo(), atendimento);
		
	}

	@Override
	public Atendimento buscarAtendimentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		
		Atendimento atendimento = listaAtendimentos.get(codigo);
		if(atendimento == null)
			throw new ObjetoNaoEncontrado();
		
		return atendimento;
	}

	@Override
	public void excluir(Atendimento atendimento) {
		listaAtendimentos.remove(atendimento);
		atendimento.setStatus(false);
		
	}

	@Override
	public void editar(Atendimento atendimento) {
		
		System.out.println("Atendimento editaco com sucesso.Teste:"+atendimento.getStatus());
		
	}

	@Override
	public HashMap<Integer,Atendimento> getListaAtendimentos(boolean status) {
		
		return this.listaAtendimentos;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		
		System.out.println("Atendimento retornado.");
		
	}

	@Override
	public void inicializarLista(Boolean status, FuncionarioRN funcionarioRN,
			ClienteRN clienteRN, ServicoRN servicoRN) {
		listaAtendimentos = new HashMap<Integer,Atendimento>();
		this.iniciarListaTeste();
		
	}

	public void iniciarListaTeste(){
	
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Kaio");
		cliente.setBairro("Setor sudoeste");
		cliente.setCep("74305400");
		cliente.setCodigoDependente(-1);
		cliente.setCpf("74305400");
		cliente.setEmail("Kaio cristian costa silva");
		cliente.setPendente(false);
		cliente.setRg("5019294");
		cliente.setSaldo(0.0);
		cliente.setSexo("M");
		cliente.setTelefone1("32874164");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(1);
		funcionario.setNome("Sonia");
		funcionario.setBairro("Setor sudoeste");
		funcionario.setCep("74305400");
		funcionario.setCpf("74305400");
		funcionario.setEmail("Kaio cristian costa silva");
		funcionario.setRg("5019294");
		funcionario.setSexo("M");
		funcionario.setTelefone1("32874164");
		funcionario.setLogin("Batuta");
		funcionario.setSenha("batuta");
		funcionario.setPrivilegios("admin/normal");
		
		Servico servico = new Servico();
		servico.setCodigo(1);
		servico.setNome("Corte cabelo");
		servico.setSituacao(true);
		servico.setTipo('A');
		servico.setValor(15.5);
		servico.setValorComissao(30.0);

		Atendimento atendimento = new Atendimento();
		atendimento.setCliente(cliente);
		atendimento.setFuncionario(funcionario);
		atendimento.setServico(servico);
		atendimento.setStatus(true);
		atendimento.setCodigo(0);
		
		this.listaAtendimentos.put(atendimento.getCodigo(), atendimento);
	
	}
	
}
