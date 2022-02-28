package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.domain.modele.dto.FilmDto;
import com.example.entrevueSpringBoot.domain.modele.exception.FilmNotFoundException;

import java.util.List;

public interface FilmService {
    FilmDto creerFilm(FilmDto filmDto);

    FilmDto obtenirFilm(Long id) throws FilmNotFoundException;

    List<FilmDto> listFilm() throws FilmNotFoundException;


    void deleteFilm(Long id) throws FilmNotFoundException;

    FilmDto modifyFilm(Long id,FilmDto filmDto) throws FilmNotFoundException;
}
