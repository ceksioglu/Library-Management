package github.ceksioglu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_management");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Transaction başlat ve işlemleri gerçekleştir
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        transaction.commit();
    }
}