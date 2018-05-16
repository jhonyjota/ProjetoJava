package prova;

import org.hibernate.Session;

import prova.model.Cliente;
import prova.persistence.ClienteHibernateDAO;
import prova.persistence.HibernateUtil;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Cliente c1 = new Cliente();
    	c1.setNome("Huguinho");
    	c1.setEmail("huguinho@gmail.com");
    	c1.setEndereco("End do Huguinho");
    	c1.setFone("1234");
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	ClienteHibernateDAO<Cliente> clienteDao = new ClienteHibernateDAO<Cliente>(session);
    	clienteDao.beginTransaction();
    	//clienteDao.excluir(1);
    	//Cliente cId1 = clienteDao.encontrarPeloId(1);
    	//System.out.println("Nome: "+cId1.getNome());
    	
    	clienteDao.persistir(c1);
    	clienteDao.commit();
    	clienteDao.closeSession();
    }
}
