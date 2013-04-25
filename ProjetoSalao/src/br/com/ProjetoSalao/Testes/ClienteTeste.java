package br.com.ProjetoSalao.Testes;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;

public class ClienteTeste {

	public static void main(String[] args){
		
		ClienteRN clienteRN = new ClienteRN();
		Cliente cliente = new Cliente();
		cliente.setCodigo(5);
		cliente.setNome("Kaio");
		clienteRN.salvar(cliente);
		
		System.out.println(clienteRN.getClientePorCodigo(5).getNome());
		
	}
	
}
