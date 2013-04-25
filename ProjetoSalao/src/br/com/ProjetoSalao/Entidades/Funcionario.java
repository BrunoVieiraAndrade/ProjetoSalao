/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoSalao.Entidades;

/**
 *
 * @author Kaio
 */
public class Funcionario extends Pessoa {

    private String login;
    private String senha;
    private String privilegios;
    
    
    public String getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(String privilegios) {
		this.privilegios = privilegios;
	}

	public Funcionario(){
    	
    	
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarSenha(String senha) {
        return false;
    }
    
}
