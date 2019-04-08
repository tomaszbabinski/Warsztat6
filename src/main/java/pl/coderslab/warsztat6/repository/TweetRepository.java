package pl.coderslab.warsztat6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztat6.entity.Tweet;
import pl.coderslab.warsztat6.entity.User;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
    List<Tweet> findAllByUserId(Long id);
    List<Tweet> findAllByUser(User user);
    Tweet findById(Long id);

}
