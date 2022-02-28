package com.example.entrevueSpringBoot.controleur;

import com.example.entrevueSpringBoot.service.FilmService;
import org.openapitools.client.model.FilmDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmControleur {

    @Autowired
    FilmService filmService;

    @GetMapping(path = "/api/film/{id}", produces = "application/json")
    ResponseEntity obtenirFilm(@PathVariable Long id) {
        return new ResponseEntity(filmService.obtenirFilm(id), HttpStatus.OK);

    }

    @GetMapping(path = "/api/films", produces = "application/json")
    ResponseEntity<FilmDto> films() {
        return new ResponseEntity(filmService.listFilm(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/film", produces = "application/json")
    ResponseEntity<org.openapitools.client.model.FilmDto> ajouterFilm(@RequestBody FilmDto filmDto) {
        return new ResponseEntity(filmService.creerFilm(filmDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/api/film/{id}", produces = "application/json")
    ResponseEntity deleteFilms(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping(path = "/api/film/{id}", produces = "application/json")
    ResponseEntity<FilmDto> modifyFilms(@PathVariable Long id, @RequestBody FilmDto filmDto) {
        return new ResponseEntity(filmService.modifyFilm(id, filmDto), HttpStatus.OK);
    }

}
