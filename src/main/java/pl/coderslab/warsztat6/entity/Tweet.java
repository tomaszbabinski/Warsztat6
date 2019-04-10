package pl.coderslab.warsztat6.entity;

import org.hibernate.validator.constraints.NotEmpty;
import pl.coderslab.warsztat6.dto.TweetDto;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Table(name = "tweeter_tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String title;

    @NotEmpty
    @Size(max = 160)
    private String tweetText;

    private LocalDateTime created;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "tweet")
    private List<Comment> comments;



    public Tweet() {
    }

    public Tweet(TweetDto tweetDto){
        this.title = tweetDto.getTitle();
        this.created = tweetDto.getCreated();
        this.tweetText = tweetDto.getContent();
        this.user = tweetDto.getUser();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getFullDate(){
        return this.created.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}

