package br.com.partypoker.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.sql.DriverManager;

import br.com.partypoker.model.Entidade;

public abstract class DAOGeneric<E extends Entidade> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	protected Class<E> classe;
	 
	static {
		try {
			emf = Persistence.createEntityManagerFactory("persistence");				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public DAOGeneric (){
		
	}
	
	public DAOGeneric(Class<E> classe) {
		super();
		em = emf.createEntityManager();
		this.classe = classe;
	}
	
	public DAOGeneric<E> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAOGeneric<E> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	public DAOGeneric<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAOGeneric<E> incluirAtomico(E entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<E> obterTodos(int qtde, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	
}
