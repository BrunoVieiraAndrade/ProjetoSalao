/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ClienteDAO;
import br.com.ProjetoSalao.PersistenciaDAO.ClientePersistencia;

import java.util.List;

/**
 *
 * @author Kaio
 */

public class ClienteRN {
    
    ClienteDAO clientePersistencia = new ClientePersistencia();
   
    public void salvar(Cliente cliente){

        clientePersistencia.salvar(cliente);
        
    }
    
    public Cliente getClientePorCodigo(Integer codigo)throws ObjetoNaoEncontrado{
        
        return clientePersistencia.getClientePorCodigo(codigo);
        
    }
    
    public List<Cliente> buscarClientePorNome(String parteNome){
        
        return clientePersistencia.getListaClientePorNome(parteNome);
        
    }
    
    public void excluir(Cliente cliente){
        
        clientePersistencia.excluir(cliente);
        
    }
    
    public void editar(Cliente cliente){
        
        clientePersistencia.salvar(cliente);
        
    }
    
    public List<Cliente> getLista(boolean status){
        
        return clientePersistencia.getListaClientes(status);
        
    }
    
    public void desfazerExclusao(Integer codigo){
        
        clientePersistencia.desfazerExclusao(codigo);
        
    }
    
    public void inicializarLista(Boolean status){
        
        clientePersistencia.inicializarLista(status);
        
    }
    
}
