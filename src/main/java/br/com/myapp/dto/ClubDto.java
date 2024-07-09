package br.com.myapp.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {

    private Long id;

    @NotEmpty(message = "Title should not be empty")
    private String title;

    @NotEmpty(message = "PhotoUrl not be empty")
    private String photoUrl;

    @NotEmpty(message = "Content should not be empty")
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

}
