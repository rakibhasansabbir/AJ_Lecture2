package bd.ac.seu.ormdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public Main() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
//        Student student = new Student(2014100071,"Rakib Hasan Sabbir");
//        session.save(student);
        Student student = session.get(Student.class,2014100071);
        session.getTransaction().commit();
        System.out.println(student);
    }

    public static void main(String[] args) {
        new Main();
    }
}
