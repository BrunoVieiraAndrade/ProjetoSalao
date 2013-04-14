/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;



import java.util.List;

import br.com.ProjetoSalao.Entidades.Servico;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ServicoDAO;
import br.com.ProjetoSalao.PersistenciaDAO.ServicoPersistencia;

/**
 *
 * @author Kaio
 */
public class ServicoRN {
    
    ServicoDAO servicoPersistencia = new ServicoPersistencia();
   
    public void salvar(Servico servico){
        
        servicoPersistencia.salvar(servico);
        
    }
    
    public Servico buscarServicoPorCodigo(Integer codigo)throws ObjetoNaoEncontrado{
        
        return servicoPersistencia.buscarServicoPorCodigo(codigo);
        
    }
    
    public void excluir(Servico servico){
        
        servicoPersistencia.excluir(servico);
        
    }
    
    public void editar(Servico servico){
        
        servicoPersistencia.salvar(servico);
        
    }
    
    public List<Servico> getLista(boolean status){
        
        return servicoPersistencia.getListaServicos(status);
        
    }
    
    public void desfazerExclusao(Integer codigo){
        
        servicoPersistencia.desfazerExclusao(codigo);
        
    }
    
    public void inicializarLista(boolean status){
        
        servicoPersistencia.inicializarLista(status);
        
    }
    
}
