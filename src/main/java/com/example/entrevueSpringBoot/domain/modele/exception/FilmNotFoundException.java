package com.example.entrevueSpringBoot.domain.modele.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FilmNotFoundException extends ResponseStatusException {

    public FilmNotFoundException(String reason) {
        super(HttpStatus.NOT_FOUND, reason);
    }
}
