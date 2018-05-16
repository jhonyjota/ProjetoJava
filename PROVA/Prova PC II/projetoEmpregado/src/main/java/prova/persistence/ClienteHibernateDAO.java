package prova.persistence;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import prova.model.Cliente;

public class ClienteHibernateDAO<T> implements IDAO<T> {

	Logger logger = Logger.getLogger(ClienteHibernateDAO.class.getName());
	private Transaction currentTransaction;
	Session session;
	
	public ClienteHibernateDAO(Session session) {
		this.session = session;
	}
	
	@Override
	public void persistir(T o) throws Exception {
		// TODO Auto-generated method stub
		session.save(o);
	}

	@Override
	public void excluir(Integer id) throws Exception {
		// TODO Auto-generated method stub
		this.session.remove(id);
	}

	@Override
	public void alterar(T e) throws Exception {
		// TODO Auto-generated method stub
		this.session.merge(e);
	}

	@Override
	public T encontrarPeloId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (T) this.session.byId(Cliente.class).load(id);
	}

	@Override
	public List<T> Listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void closeSession() {
		this.session.close();
	}
		
	public void beginTransaction() {
		this.currentTransaction = this.session.beginTransaction();
	}
		
	public void commit() {
		this.currentTransaction.commit();
	}
	
}
