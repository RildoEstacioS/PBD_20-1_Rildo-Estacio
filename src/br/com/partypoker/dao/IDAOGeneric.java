package br.com.partypoker.dao;

import java.util.List;

import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Entidade;

public interface IDAOGeneric<E extends Entidade> {
	
	
	
	public void create(E e) throws DaoException;

	public E search(Class<E> classe, Long id) throws DaoException;

	public void disable(E e) throws DaoException;

	public boolean remove(E e) throws DaoException;

	public boolean update(E e) throws DaoException;

	public List<E> searchAll() throws DaoException;

}
