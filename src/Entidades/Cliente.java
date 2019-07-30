package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date datanac;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String email, Date datanac) {
		this.nome = nome;
		this.email = email;
		this.datanac = datanac;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatanac() {
		return datanac;
	}

	public void setDatanac(Date datanac) {
		this.datanac = datanac;
	}
	
	public String toString() {
		return nome + "("+ sdf.format(datanac) + ") - " + email;
	}
	
}
