package br.com.partypoker.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.sql.DriverManager;

import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Entidade;

public class DAOGeneric<E extends Entidade> implements IDAOGeneric<E>{

	private static EntityManagerFactory emf;
	private static EntityManager em;
	protected Class<E> classe;
	 
	static {
		try {
			emf = Persistence.createEntityManagerFactory("partypoker");
			em = emf.createEntityManager();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Erro no Entity Manager");
		}
	}
	
	public DAOGeneric (){}
	public EntityManager entityManager() {
		return emf.createEntityManager();
	}
	
	public DAOGeneric(Class<E> classe) {
		super();
		this.classe = classe;
	}
	@Override	
	public void create(E e) throws DaoException{
		em = entityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			em.close();
		} catch (Exception err) {
			System.err.println(err.getMessage());
			err.printStackTrace();
			em.getTransaction().rollback();
			throw new DaoException("Erro ao inserir " + e.getClass().getSimpleName() + err.getMessage());
		}
	}
	
	@Override
	public E search(Class<E> e, Long id) throws DaoException {
		em = entityManager();
		E result = null;
		
		try {
			result = em.find(e, id);
		} catch (NoResultException ex) {	
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			throw new DaoException("Nenhum resultado encontrado para " + e.getSimpleName());

		}catch (Exception e2) {
			System.err.println(e2.getMessage());
			e2.printStackTrace();
			throw new DaoException("Erro ao buscar " + e.getSimpleName() + " " + e2.getMessage());
		}
		em.close();
		return result;
	}
	
	@Override
	public boolean remove(E e) throws DaoException {
		em = entityManager();
		try {
			em.getTransaction().begin();
			em.find(classe, e);
			em.remove(e);
			em.getTransaction().commit();
			em.close();
			return true;
			
		} catch (NoResultException ex) {
			ex.printStackTrace();
			System.err.println(ex.getMessage());
			em.getTransaction().rollback();
			throw new DaoException(ex.getMessage());
		}catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			em.getTransaction().rollback();
			throw new DaoException("Erro ao remover" + e.getClass().getSimpleName() + ". " + ex.getMessage());
		}
		
	}
	
	@Override
	public boolean update(E e) throws DaoException {
		em = entityManager();
		try {
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			em.close();
			return true;
		}catch (Exception ex) {
			// TODO: handle exception
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			em.getTransaction().rollback();
			throw new DaoException("Erro ao atualizar " + e.getClass().getSimpleName() + ". " + ex.getMessage());
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> searchAll() throws DaoException {
		em = entityManager();
		List<E> ent = null;
		
		try {
			ent = em.createQuery("from " + classe.getName()).getResultList();
			
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			throw new DaoException("Erro ao buscar a lista " + classe.getSimpleName());
		}
		em.close();
		return ent;
	}

	@Override
	public void disable(E e) throws DaoException {
		// TODO Auto-generated method stub
		
	}
	
//	
//	public DAOGeneric<E> abrirTransacao(){
//		em.getTransaction().begin();
//		return this;
//	}
//	
//	public DAOGeneric<E> fecharTransacao(){
//		em.getTransaction().commit();
//		return this;
//	}
//	public DAOGeneric<E> incluir(E entidade){
//		em.persist(entidade);
//		return this;
//	}
//	
//	public DAOGeneric<E> incluirAtomico(E entidade){
//		return this.abrirTransacao().incluir(entidade).fecharTransacao();
//	}
//	
//	public List<E> obterTodos(int qtde, int deslocamento){
//		if(classe == null) {
//			throw new UnsupportedOperationException("Classe nula");
//		}
//		
//		String jpql = "select e from " + classe.getName() + " e";
//		TypedQuery<E> query = em.createQuery(jpql, classe);
//		query.setMaxResults(qtde);
//		query.setFirstResult(deslocamento);
//		return query.getResultList();
//	}
//	
//	public void fechar() {
//		em.close();
//	}

}
