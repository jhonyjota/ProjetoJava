package prova.model;

import javax.persistence.*;

@Entity
public class Cliente {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer id_cliente;
	@Column(name="nome")
	private String nome;
	@Column(name="endereco")
	private String endereco;
	@Column(name="fone")
	private String fone;
	@Column(name="email")
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
}