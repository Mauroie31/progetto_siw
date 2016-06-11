package it.clinica.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.clinica.dao.PrerequisitoDao;
import it.clinica.model.Prerequisito;

@Stateless(name="prerequisitoFacade")
public class PrerequisitoFacade {
	
	@PersistenceContext(unitName="unit-clinica")
	private EntityManager em;

	public PrerequisitoFacade(EntityManager em) {
		this.em = em;
	}
	
	public Prerequisito findPrerequisito(Long id_prerequisito) {
		PrerequisitoDao dao = new PrerequisitoDao(this.em);
		this.em.getTransaction().begin();
		Prerequisito prerequisito = dao.findById(id_prerequisito);
		this.em.getTransaction().commit();
		return prerequisito;
	}
	
	public List<Prerequisito>  findAllPrerequisiti() {
		PrerequisitoDao dao = new PrerequisitoDao(this.em);
		this.em.getTransaction().begin();
		List<Prerequisito> lista = dao.findAll();
		this.em.getTransaction().commit();
		return lista;
		
	}
	

}