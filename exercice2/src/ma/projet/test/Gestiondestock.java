package ma.projet.test;

import ma.projet.util.HibernateUtil;

public class Gestiondestock {
    public static void main(String[] args) {
       HibernateUtil.getSessionFactory().openSession();
    }
}
