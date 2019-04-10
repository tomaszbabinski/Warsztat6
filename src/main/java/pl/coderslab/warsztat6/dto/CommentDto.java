package pl.coderslab.warsztat6.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import pl.coderslab.warsztat6.entity.Tweet;
import pl.coderslab.warsztat6.entity.User;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {


    private Long id;


    private User user;


    private Tweet tweet;

    @NotBlank
    @Size(max = 140)
    private String text;


}
