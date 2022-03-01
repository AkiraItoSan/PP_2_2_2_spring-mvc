package web.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import web.models.User;

public interface UserDao extends JpaRepository<User, Long> {

}
