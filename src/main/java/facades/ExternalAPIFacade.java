package facades;

import javax.persistence.EntityManagerFactory;

public class ExternalAPIFacade {
    private static ExternalAPIFacade instance;
    private static EntityManagerFactory emf;

    private ExternalAPIFacade() {}


    public static ExternalAPIFacade getExternalAPIFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new ExternalAPIFacade();
        }
        return instance;
    }


}
