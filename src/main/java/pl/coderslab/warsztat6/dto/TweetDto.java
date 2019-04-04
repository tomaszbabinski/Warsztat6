package pl.coderslab.warsztat6.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Data
@NoArgsConstructor
public class TweetDto {

    private Long id;


    private String title;

    @NotBlank
    @Size(max = 140)
    private String content;

    private LocalDateTime created;

    private UserDto userDto;

    public String getFullDate(){
        return this.created.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}