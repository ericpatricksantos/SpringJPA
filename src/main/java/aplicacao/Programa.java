package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Criando os objetos para inserir na tabela
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "anas@gmail.com");
		
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		 *Inserindo os dados na tabela
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		*/
			
		/*
		 Procurando os dados na tabela através do id
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		*/
		
		/* Apagar pessoa do banco de dados*/
		
		Pessoa p = em.find(Pessoa.class, 2); // buscar no banco de dados 
		
		em.getTransaction().begin();
		
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println("Pronto");	
	
		em.close();
		emf.close();
		
	}

}
