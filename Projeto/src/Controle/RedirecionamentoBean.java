package Controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.io.Serializable;

@ManagedBean(name = "redirecionar")
@ViewScoped
public class RedirecionamentoBean implements Serializable{

	public String inicio(){
		
	  return "home?faces-redirect=true";
	}
	public String listar(){
		
		  return "listaMusicas?faces-redirect=true";
		}
	
	public String listarCrud(){
		
		  return "CRUDmusicas?faces-redirect=true";
		}
}
