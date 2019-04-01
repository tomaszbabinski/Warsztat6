package pl.coderslab.warsztat6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztat6.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
