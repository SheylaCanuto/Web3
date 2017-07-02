package Controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import Controle.Musica;

@ManagedBean(name="crudAjax")
@ViewScoped
public class CrudAjax implements Serializable{
	
	private List<Musica> lista = new ArrayList<Musica>();
	private Musica objeto;
	private Boolean editando;

	public CrudAjax(){
		editando = false;
	}
	public void novo(){
		objeto = new Musica();
		editando = true;
	}
	public void salvar(){
		if(objeto.getId() == null){
			objeto.setId(lista.size()+1);
			lista.add(objeto);
		}
		editando = false;
	}

	public void cancelar(){
		editando = false;
	}

	public void alterar(Musica obj){
	objeto = obj;
	editando = true;

	}

	public void excluir(Musica obj){
		lista.remove(obj);
	}

	public List<Musica> getLista() {
		return lista;
	}

	public void setLista(List<Musica> lista) {
		this.lista = lista;
	}

	public Musica getObjeto() {
		return objeto;
	}

	public void setObjeto(Musica objeto) {
		this.objeto = objeto;
	}

	public Boolean getEditando() {
		return editando;
	}

	public void setEditando(Boolean editando) {
		this.editando = editando;
	}

	
	
}
