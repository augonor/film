package com.example.entrevueSpringBoot.service.impl;

import com.example.entrevueSpringBoot.domain.modele.entite.Acteur;
import com.example.entrevueSpringBoot.domain.modele.entite.Film;
import com.example.entrevueSpringBoot.domain.modele.exception.FilmNotFoundException;
import com.example.entrevueSpringBoot.domain.modele.mapper.FilmMapper;
import com.example.entrevueSpringBoot.domain.modele.repository.FilmRepository;
import com.example.entrevueSpringBoot.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.client.model.FilmDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;
    private final FilmMapper filmMapper;

    public FilmServiceImpl(FilmRepository filmRepository, FilmMapper filmMapper) {
        this.filmRepository = filmRepository;
        this.filmMapper = filmMapper;
    }


    @Override
    public FilmDto creerFilm(FilmDto filmDto) {

        Film film = filmMapper.toFilm(filmDto);
        for (Acteur acteur : film.getActeurs()) {
            acteur.setFilm(film);
        }

        Film newFilm = filmRepository.save(film);
        return filmMapper.toDto(newFilm);
    }

    @Override
    public FilmDto obtenirFilm(Long id) throws FilmNotFoundException {
        return filmMapper.toDto(getFilm(id));
    }

    @Override
    public List<FilmDto> listFilm() throws FilmNotFoundException {
        List<Film> listFilm = filmRepository.findAll();
        return filmMapper.toListDto(listFilm);
    }

    @Override
    public void deleteFilm(Long id) throws FilmNotFoundException {
        filmRepository.delete(getFilm(id));
    }

    @Override
    public FilmDto modifyFilm(Long id, FilmDto filmDto) throws FilmNotFoundException {
        Film nouveauFilm = filmMapper.toFilm(filmDto);
        Film film = getFilm(id);
        for (Acteur acteur : film.getActeurs()) {
            acteur.setFilm(null);
        }
        film.getActeurs().clear();
       filmRepository.save(film);

        film.setActeurs(nouveauFilm.getActeurs());
        film.setDescription(filmDto.getDescription());
        film.setTitre(nouveauFilm.getTitre());

        for (Acteur acteur : nouveauFilm.getActeurs()) {
            acteur.setFilm(film);
        }
        Film newFilm = filmRepository.save(film);
        return filmMapper.toDto(newFilm);
    }

    private Film getFilm(Long id) {
        Optional<Film> film = filmRepository.findById(id);
        if (film.isEmpty()) {
            throw new FilmNotFoundException("film non trouve");
        }
        return film.get();
    }
}
