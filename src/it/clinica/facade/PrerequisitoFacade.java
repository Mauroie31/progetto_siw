package it.clinica.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import it.clinica.model.Prerequisito;

@Stateless
@EJB(name="ejb/prerequisitoFacade", beanInterface=PrerequisitoFacade.class, beanName="prerequisitoFacade")
public class PrerequisitoFacade {

	@PersistenceContext(unitName="unit-clinica")
	private EntityManager em;

	public PrerequisitoFacade() {
		
	}
	public PrerequisitoFacade(EntityManager em) {
		this.em = em;
	}

	public Prerequisito findPrerequisito(Long id_prerequisito) {
	     return this.em.find(Prerequisito.class, id_prerequisito);
	}

	
	public List<Prerequisito>  findAllPrerequisiti() {
		try{
			return this.em.createNamedQuery("findAllPrerequisiti", Prerequisito.class).getResultList();	
		}catch(NoResultException e){
			return new ArrayList<Prerequisito>();
		}
	}

}
