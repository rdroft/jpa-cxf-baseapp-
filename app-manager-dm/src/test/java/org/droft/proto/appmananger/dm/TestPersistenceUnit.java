package org.droft.proto.appmananger.dm;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by roland on 23/01/2016.
 */

public class TestPersistenceUnit {
    @Test
    public void testPU(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestH2Unit");
        EntityManager em = emf.createEntityManager();
    }
}
