package com.example.entrevueSpringBoot.domain.modele.mapper;

import com.example.entrevueSpringBoot.domain.modele.entite.Film;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.openapitools.client.model.FilmDto;

import java.util.List;

@Mapper(uses = {ActeurMapper.class}, componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FilmMapper {

    @Mapping(target = "acteurs", source="acteurs")
    Film toFilm(FilmDto filmDto);

    @Mapping(target = "acteurs", source="acteurs")
    FilmDto toDto(Film film);

    @Mapping(target = "acteurs", source="acteurs")
    List<FilmDto> toListDto(List<Film> film);
}
