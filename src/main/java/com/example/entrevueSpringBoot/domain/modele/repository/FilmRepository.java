package com.example.entrevueSpringBoot.domain.modele.repository;

import com.example.entrevueSpringBoot.domain.modele.entite.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
