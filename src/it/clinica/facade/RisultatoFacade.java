package it.clinica.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import it.clinica.model.*;

@Stateless
@EJB(name="ejb/risultatoFacade", beanInterface=RisultatoFacade.class, beanName="risultatoFacade")
public class RisultatoFacade {

	@PersistenceContext(unitName="unit-clinica")
	private EntityManager em;

	public RisultatoFacade(EntityManager em) {
		this.em = em;
	}
	
	public RisultatoFacade() {
		
	}

	public List<Risultato> findAllRisultati() {
		try{
			return this.em.createNamedQuery("findAllRisultati", Risultato.class).getResultList();	
		}catch(NoResultException e){
			return new ArrayList<Risultato>();
		}
	}

}
