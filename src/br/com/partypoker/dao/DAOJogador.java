package br.com.partypoker.dao;

import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAOJogador extends DAOGeneric<Jogador> implements IDAOJogador {
	private static EntityManagerFactory emf;
	private static EntityManager em;

	public DAOJogador() {
		super(Jogador.class);
	}

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

	public EntityManager entityManager() {
		return emf.createEntityManager();
	}

	public Usuario login(String login) throws DaoException {
		em = entityManager();
		Jogador jogador = null;
		try {
			Query query = entityManager().createQuery("select jogador from Jogador jogador where email = ?1");
			query.setParameter(1, login);
			jogador = (Jogador) query.getSingleResult();

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			throw new DaoException("Erro ao buscar");
		}
		em.close();
		return jogador;
	}
}
