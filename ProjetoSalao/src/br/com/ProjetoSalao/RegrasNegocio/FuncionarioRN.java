/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Funcionario;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.Exceptions.SenhaException;
import br.com.ProjetoSalao.InterfacesDAO.FuncionarioDAO;
import br.com.ProjetoSalao.PersistenciaDAO.FuncionarioPersistencia;

/**
 *
 * @author Kaio
 */
public class FuncionarioRN {
    
	FuncionarioDAO funcionarioPersistencia = new FuncionarioPersistencia();
   
    public void salvar(Funcionario funcionario){
        
        funcionarioPersistencia.salvar(funcionario);
        
    }
    
    public Funcionario buscarFuncionarioPorCodigo(Integer codigo)throws ObjetoNaoEncontrado{
        
        return funcionarioPersistencia.getFuncionarioPorCodigo(codigo);
        
    }
    
    public void excluir(Funcionario funcionario){
        
        funcionarioPersistencia.excluir(funcionario);
        
    }
    
    public void editar(Funcionario funcionario){
        
        funcionarioPersistencia.salvar(funcionario);
        
    }
    
    public List<Funcionario> getLista(boolean status){
        
        return funcionarioPersistencia.getListaFuncionarios(status);
        
    }
    
    public void desfazerExclusao(Integer codigo){
        
        funcionarioPersistencia.desfazerExclusao(codigo);
        
    }
    
    public void inicializarLista(Boolean status){
        
        funcionarioPersistencia.inicializarLista(status);
        
    }
    
    public Funcionario buscarFuncionarioPorLogin(String login){
        
        return funcionarioPersistencia.getFuncionarioPorLogin(login);
        
    }
    
    public Boolean validarSenha(Funcionario funcionario,String senha) throws SenhaException{
        
        if(funcionario.validarSenha(senha))
            return true;
        else
        	throw new SenhaException();
        
    }
    
}
