package com.example.entrevueSpringBoot.domain.modele.dto;


import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FilmDto {
    private Long id;
    private String titre;
    private String description;
    private List<ActeurDto> acteurs;
}
