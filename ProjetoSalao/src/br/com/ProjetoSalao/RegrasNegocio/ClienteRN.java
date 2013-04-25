/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;

import java.util.HashMap;
import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ClienteDAO;
import br.com.ProjetoSalao.PersistenciaDAO.ClientePersistencia;

/**
 *
 * @author Kaio
 */

public class ClienteRN {
    
    ClienteDAO clienteDAO = new ClientePersistencia();
    HashMap<Integer,Cliente> listaClientes = null;
    
    public ClienteRN(){
    	
    	this.listaClientes = new HashMap<Integer,Cliente>();
    	this.atualizarLista();

    }
    
    public void salvar(Cliente cliente){

        clienteDAO.salvar(cliente);
        
    }
    
    public Cliente getClientePorCodigo(Integer codigo)throws ObjetoNaoEncontrado{
        
        return clienteDAO.getClientePorCodigo(codigo);
        
    }
    
    public void excluir(Cliente cliente){
        
        clienteDAO.excluir(cliente);
        
    }

    public HashMap<Integer,Cliente> getLista(){
        
        return clienteDAO.getListaClientes();
        
    }

    private void atualizarLista(){
    	
    	this.listaClientes = clienteDAO.getListaClientes();
    	
    }
    
}
