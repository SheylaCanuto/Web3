package Controle;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


public class Musica implements Serializable {

	private Integer id;
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40, message="O nome não pode ter mais que 40 caracters")
	private String nome;
	@NotEmpty(message="O nome do artista deve ser informado")
	private String artista;
	@NotEmpty(message="O nome do album deve ser informado")
	private String album;
	
	
	public Musica(){
		
	}
	
	public Musica(Integer id, String nome, String artista, String album){
		this.id = id;
		this.nome = nome;
		this.artista = artista;
		this.album = album;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return artista;
	}
	public void setAlbum(String album) {
		this.album = album;
	}


}
