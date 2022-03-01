package web.dao;

public class UserDaoImp {


//    private final EntityManager entityManager;
//
//    public UserDaoImp(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    public void updateUser(User user) {
////        entityManager.getTransaction().begin();
//        entityManager.merge(user);
////        entityManager.getTransaction().commit();
//    }
//
//    public void remove(User user) {
////        entityManager.getTransaction().begin();
//        entityManager.remove(user);
////        entityManager.getTransaction().commit();
//    }
//
//    public void add(User user) {
////        entityManager.getTransaction().begin();
//        entityManager.persist(user);
////        entityManager.getTransaction().commit();
//    }
//
//    public List<User> listUsers() {
////        entityManager.getTransaction().begin();
//        List<User> query = entityManager.createQuery("select user from User").getResultList();
////        entityManager.getTransaction().commit();
//        return query;
//    }
//
//    public User getUserById(Long id) {
//        User user = entityManager.createQuery(("from User where id=" + id), User.class).getSingleResult();
//        return user;
//    }
}
