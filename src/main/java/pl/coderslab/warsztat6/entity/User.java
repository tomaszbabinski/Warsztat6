package pl.coderslab.warsztat6.entity;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.warsztat6.dto.UserDto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="tweeter_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String passwordRepeat;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<Tweet> tweets;

    public User() {
    }


    public User(UserDto userDto) {
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
        setPassword(userDto.getPassword());
        this.email = userDto.getEmail();
    }

    public String getPassword() {
        return password;
    }

    public String getFullName(){
        return firstName+" "+lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean isPasswordCorrect(String password) {
        return BCrypt.checkpw(password, this.password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }
}
