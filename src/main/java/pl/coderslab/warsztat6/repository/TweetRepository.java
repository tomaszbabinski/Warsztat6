package pl.coderslab.warsztat6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztat6.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
