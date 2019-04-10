package pl.coderslab.warsztat6.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String password;

    @NotBlank
    private String passwordRepeat;

    @NotBlank
    @Email
    private String email;

    private List<TweetDto> tweets = new ArrayList<>();

    private List<CommentDto> comments = new ArrayList<>();

    }
