package com.example.entrevueSpringBoot.domain.modele.dto;


import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ActeurDto {

    private Long id;
    private String nom;
    private String prenom;

}
