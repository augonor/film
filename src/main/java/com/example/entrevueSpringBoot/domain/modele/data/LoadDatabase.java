package com.example.entrevueSpringBoot.domain.modele.data;

import com.example.entrevueSpringBoot.domain.modele.entite.Acteur;
import com.example.entrevueSpringBoot.domain.modele.entite.Film;
import com.example.entrevueSpringBoot.domain.modele.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Slf4j
public class LoadDatabase {

    @Autowired
    FilmRepository filmRepository;

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
            Film film1 = Film.builder().titre("The Batman")
                    .description("Dans sa deuxième année de lutte contre le crime, le milliardaire et justicier masqué Batman explore la corruption qui sévit à Gotham et notamment comment elle pourrait être liée à sa propre famille, les Wayne, à qui il doit toute sa fortune.").build();

            Acteur acteur1 = Acteur.builder().nom("Robert").prenom("Pattinson").film(film1).build();
            Acteur acteur2 = Acteur.builder().nom("Zoé").prenom("Karvitz").film(film1).build();
            Acteur acteur3 = Acteur.builder().nom("Colin").prenom("Farrell").film(film1).build();
            film1.setActeurs(Arrays.asList(acteur1, acteur2, acteur3));

            log.info("preloading date  data ..." + film1.getTitre());
            filmRepository.save(film1);
        };
    }

}
