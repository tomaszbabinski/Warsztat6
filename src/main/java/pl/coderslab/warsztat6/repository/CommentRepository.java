package pl.coderslab.warsztat6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztat6.entity.Comment;
import pl.coderslab.warsztat6.entity.Tweet;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByTweet(Tweet tweet);
    List<Comment> findAllByTweetId(Long id);
}
