package util;


public class HibernateUtil {


/*	
    private static final SessionFactory sessionFactory;
    private static final ServiceRegistry serviceRegistry;

    
    static {
            try {
                    // Create the SessionFactory from hibernate.cfg.xml
                    Configuration configuration = new Configuration();
                    configuration.configure();
                    serviceRegistry = new ServiceRegistryBuilder().applySettings(
                                    configuration.getProperties()).build();
                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable ex) {
                    // Make sure you log the exception, as it might be swallowed
                    System.err.println("Initial SessionFactory creation failed." + ex);
                    throw new ExceptionInInitializerError(ex);
            }

    }

    public static SessionFactory getSessionFactory() {
            return sessionFactory;
    }

    public static void closeSessionFactory() {
    	if (sessionFactory != null)
        	sessionFactory.close();
		}
	}
*/
}
