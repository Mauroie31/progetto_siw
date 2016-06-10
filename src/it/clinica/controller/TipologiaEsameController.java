package it.clinica.controller;

import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import it.clinica.facade.*;
import it.clinica.model.*;


@ManagedBean
@RequestScoped
@EJB(name = "tipologiaEsameFacade", beanInterface = TipologiaEsameFacade.class) 
public class TipologiaEsameController {
	
	@EJB(name = "tipologiaEsameFacade")
	private TipologiaEsameFacade tipologiaEsameFacade;
	@EJB(name = "prerequisitoFacade")
	private PrerequisitoFacade prerequisitoFacade;

	private Long id;
	private String nome;
	private String descrizione;
	private double costo;
	

	
//	private Set<String> indicatoriEsami;
	
//	private Map<Long, Esame> esami;
	
//	//caso d'uso UC1
//	public List<TipologiaEsame> elencoTipologieEsame() {
//		return this.tipologiaEsameFacade.findAllTipologieEsami();
//	}
//	
//	public String dettagliTipologiaEsame(Long id_tipologia) {
//		TipologiaEsame tipologiaEsame = this.tipologiaEsameFacade.findTipologiaEsame(id_tipologia);
//		return tipologiaEsame.getDescrizione();
//	}
	//end UC1
	
	//caso d'uso uc4
	
	public String goToPagina() {
		return "/portaleAdmin/inserisciTipologiaEsame.jsp";
	}

	public List<Prerequisito> getPrerequisiti(){
		List<Prerequisito> prerequisiti= this.prerequisitoFacade.findAllPrerequisiti();
		return prerequisiti;
		
	}
	
	
	public void setTipologiaEsameFacade(TipologiaEsameFacade tipologiaEsameFacade) {
		this.tipologiaEsameFacade = tipologiaEsameFacade;
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
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
//	public Set<String> getIndicatoriEsami() {
//		return indicatoriEsami;
//	}
//	public void setIndicatoriEsami(Set<String> indicatoriEsami) {
//		this.indicatoriEsami = indicatoriEsami;
//	}
//	public Map<Long, Esame> getEsami() {
//		return esami;
//	}
//	public void setEsami(Map<Long, Esame> esami) {
//		this.esami = esami;
//	}
	
}
