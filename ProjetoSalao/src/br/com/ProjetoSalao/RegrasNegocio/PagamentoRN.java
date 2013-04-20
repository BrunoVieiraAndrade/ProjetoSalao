/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.RegrasNegocio;

import br.com.ProjetoSalao.Entidades.Pagamento;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.PagamentoDAO;
import br.com.ProjetoSalao.PersistenciaDAO.PagamentoPersistencia;
import java.util.List;

/**
 *
 * @author Kaio
 */
public class PagamentoRN {
    
    PagamentoDAO pagamentoPersistencia = new PagamentoPersistencia();
   
    public void salvar(Pagamento pagamento){
        
        pagamentoPersistencia.realizarPagamento(pagamento);
        
    }
    
   public void efetivarPagamento(Pagamento pagamento){
        
        pagamentoPersistencia.efetivarPagamento(pagamento);
        
    }
    
    public Pagamento buscarPagamentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
        
        return pagamentoPersistencia.buscarPagamentoPorCodigo(codigo);
        
    }
    
    public void excluir(Pagamento pagamento){
        
        pagamentoPersistencia.excluir(pagamento);
        
    }
    
    public void editar(Pagamento pagamento){
        
        pagamentoPersistencia.realizarPagamento(pagamento);
        
    }
    
    public List<Pagamento> getListaPagamentos(boolean status,String dataInicio,String dataFim){
        
        return pagamentoPersistencia.getListaPagamentos(status, dataInicio, dataFim);
        
    }
    
    public void desfazerExclusao(Integer codigo){
        
        pagamentoPersistencia.desfazerExclusao(codigo);
        
    }
    
    public void inicializarLista(Boolean status,FuncionarioRN funcionarioRN,ClienteRN clienteRN,ServicoRN servicoRN){
        
        pagamentoPersistencia.inicializarLista(status, funcionarioRN, clienteRN, servicoRN);
        
    }
    
}
