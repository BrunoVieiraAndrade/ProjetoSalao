/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;

import br.com.ProjetoSalao.Entidades.Atendimento;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.AtendimentoDAO;
import br.com.ProjetoSalao.PersistenciaDAO.AtendimentoPersistencia;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Kaio
 */
public class AtendimentoRN {
    
    AtendimentoDAO atendimentoPersistencia = new AtendimentoPersistencia();
   
    public void salvar(Atendimento atendimento){
        
        atendimentoPersistencia.salvar(atendimento);
        
    }
    
    public Atendimento buscarAtendimentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
        
        return atendimentoPersistencia.buscarAtendimentoPorCodigo(codigo);
        
    }
    
    public void excluir(Atendimento atendimento){
        
        atendimentoPersistencia.excluir(atendimento);
        
    }
    
    public void editar(Atendimento atendimento){
        
        atendimentoPersistencia.salvar(atendimento);
        
    }
    
    public List<Atendimento> getListaAtendimentos(boolean status,Date date){
        
        return atendimentoPersistencia.getListaAtendimentos(status);
        
    }
    
    public void desfazerExclusao(Integer codigo){
        
        atendimentoPersistencia.desfazerExclusao(codigo);
        
    }
    
    public void inicializarLista(Boolean status,FuncionarioRN funcionarioRN,ClienteRN clienteRN,ServicoRN servicoRN){
        
        atendimentoPersistencia.inicializarLista(status, funcionarioRN, clienteRN, servicoRN);
        
    }
    
}
