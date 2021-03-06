package it.clinica.model;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "Prerequisito")
@NamedQueries({
	@NamedQuery(name = "findAllPrerequisiti", query = "SELECT p FROM Prerequisito p order by p.nome"),

	@NamedQuery(name = "findPrerequisitiByTipologiaEsame", query = "SELECT p.tipologiaesame FROM Prerequisito p")
})
public class Prerequisito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String descrizione;
	@ManyToMany(mappedBy = "prerequisiti", cascade = CascadeType.ALL)
	private List<TipologiaEsame> tipologieEsami;


	public Prerequisito(){
	}


	public List<TipologiaEsame> getTipologieEsami() {
		return tipologieEsami;
	}
	public void setTipologieEsami(List<TipologiaEsame> tipologieEsami) {
		this.tipologieEsami = tipologieEsami;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
