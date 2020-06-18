package hibernatetest;

import java.text.MessageFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Book;
import model.Person;
import util.HibernateUtil;

public class TestCode {

	public static void main(String[] args) {

		
		
		
/*		
	       final Configuration configuration = new Configuration().configure();
	       final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	       final SessionFactory factory = configuration.buildSessionFactory(builder.build());
	       final Session session = factory.openSession();
	       final Book book = new Book("93939398948 ", "Java 8", "Author");
	       session.beginTransaction();
	       session.save(book);
	       session.getTransaction().commit();
	       final List<Book> books = session.createCriteria(Book.class).list();
	       System.out.println("\n----\n");
	       System.out.println(MessageFormat.format("Storing {0} books in the database", books.size()));
	       for (final Book b : books) {
	           System.out.println(b);
	       }
	       System.out.println("\n----\n");
	       session.close();
	       factory.close();		
*/

/*		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Person p1 = new Person();
        p1.setFirstName("Seetesh");
        p1.setLastName("Hindlekar");
        p1.setAge(45);
        long personId = (Long) session.save(p1);
        session.getTransaction().commit();
        
        Person person = (Person) session.get(Person.class, personId);        
        System.out.println(person);
                
        session.close();
*/
		
		
		
		
	}

}
