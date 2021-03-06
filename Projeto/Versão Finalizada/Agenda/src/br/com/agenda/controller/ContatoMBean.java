package br.com.agenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import br.com.agenda.models.Contato;

@ManagedBean
@ViewScoped
public class ContatoMBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Contato contato = new Contato();
    private List<Contato> contatos = new ArrayList<Contato>();
    /*gets and sets*/
    
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
	
	public void salvar(ActionEvent e){
		contatos.add(contato);
		contato = new Contato();
	}
    
    
	

}





